# Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
# reserved. Use of this source code is governed by a BSD-style license that
# can be found in the LICENSE file.

from date_util import *
from file_util import *
import git_util as git
from optparse import OptionParser
import re
from readme_util import read_readme_file
import sys

# cannot be loaded as a module
if __name__ != "__main__":
    sys.stderr.write('This file cannot be loaded as a module!')
    sys.exit(1)

# script directory
script_dir = os.path.dirname(__file__)

# JCEF root directory
jcef_dir = os.path.abspath(os.path.join(script_dir, os.pardir))


# parse command-line options
disc = """
This utility creates the version header file.
"""

parser = OptionParser(description=disc)
parser.add_option('--header', dest='header', metavar='FILE',
                  help='output version header file [required]')
parser.add_option('--cef-path', dest='cefpath',
                  help='path to the CEF binary distribution [required]')
parser.add_option('-q', '--quiet',
                  action='store_true', dest='quiet', default=False,
                  help='do not output detailed status information')
(options, args) = parser.parse_args()

# the header option is required
if options.header is None or options.cefpath is None:
    parser.print_help(sys.stdout)
    sys.exit(1)

def write_svn_header(header):
    """ Creates the header file for the current revision
       if the information has changed or if the file doesn't already exist. """

    if path_exists(header):
        oldcontents = read_file(header)
    else:
        oldcontents = ''

    if not git.is_checkout(jcef_dir):
      raise Exception('Not a valid checkout')

    commit_number = git.get_commit_number(jcef_dir)
    commit_hash = git.get_hash(jcef_dir)

    year = get_year()

    # Read and parse the CEF version file.
    args = {}
    read_readme_file(os.path.join(options.cefpath, 'README.txt'), args)

    version = '%s.%s.%s.g%s' % (args['CEF_MAJOR'], args['CEF_BUILD'], commit_number, commit_hash[:7])

    newcontents = '// Copyright (c) '+year+' The Chromium Embedded Framework Authors. All rights\n'+\
                  '// reserved. Use of this source code is governed by a BSD-style license that\n'+\
                  '// can be found in the LICENSE file.\n'+\
                  '//\n'+\
                  '// Redistribution and use in source and binary forms, with or without\n'+\
                  '// modification, are permitted provided that the following conditions are\n'+\
                  '// met:\n'+\
                  '//\n'+\
                  '//    * Redistributions of source code must retain the above copyright\n'+\
                  '// notice, this list of conditions and the following disclaimer.\n'+\
                  '//    * Redistributions in binary form must reproduce the above\n'+\
                  '// copyright notice, this list of conditions and the following disclaimer\n'+\
                  '// in the documentation and/or other materials provided with the\n'+\
                  '// distribution.\n'+\
                  '//    * Neither the name of Google Inc. nor the name Chromium Embedded\n'+\
                  '// Framework nor the names of its contributors may be used to endorse\n'+\
                  '// or promote products derived from this software without specific prior\n'+\
                  '// written permission.\n'+\
                  '//\n'+\
                  '// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS\n'+\
                  '// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT\n'+\
                  '// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR\n'+\
                  '// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT\n'+\
                  '// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,\n'+\
                  '// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT\n'+\
                  '// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,\n'+\
                  '// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY\n'+\
                  '// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT\n'+\
                  '// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE\n'+\
                  '// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.\n'+\
                  '//\n'+\
                  '// ---------------------------------------------------------------------------\n'+\
                  '//\n'+\
                  '// This file is generated by the make_version_header.py tool.\n'+\
                  '//\n\n'+\
                  '#ifndef JCEF_INCLUDE_JCEF_VERSION_H_\n'+\
                  '#define JCEF_INCLUDE_JCEF_VERSION_H_\n\n'+\
                  '#define JCEF_VERSION "' + version + '"\n'+\
                  '#define JCEF_COMMIT_NUMBER ' + commit_number + '\n'+\
                  '#define JCEF_COMMIT_HASH "' + commit_hash + '"\n'+\
                  '#define JCEF_COPYRIGHT_YEAR ' + year + '\n\n'+\
                  '#define DO_MAKE_STRING(p) #p\n'+\
                  '#define MAKE_STRING(p) DO_MAKE_STRING(p)\n\n'+\
                  '#endif  // JCEF_INCLUDE_JCEF_VERSION_H_\n'
    if newcontents != oldcontents:
        write_file(header, newcontents)
        return True

    return False

written = write_svn_header(options.header)
if not options.quiet:
  if written:
    sys.stdout.write('File '+options.header+' updated.\n')
  else:
    sys.stdout.write('File '+options.header+' is already up to date.\n')

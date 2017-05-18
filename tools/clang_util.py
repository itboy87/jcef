# Copyright (c) 2017 The Chromium Embedded Framework Authors. All rights
# reserved. Use of this source code is governed by a BSD-style license that
# can be found in the LICENSE file

from exec_util import exec_cmd
import os
import sys

# Script directory.
script_dir = os.path.dirname(__file__)

if sys.platform == 'win32':
  clang_format_exe = 'buildtools/win/clang-format.exe'
elif sys.platform == 'darwin':
  clang_format_exe = 'buildtools/mac/clang-format'
elif sys.platform.startswith('linux'):
  clang_format_exe = 'buildtools/linux64/clang-format'
else:
  raise Exception("Unsupported platform: %s" % sys.platform)

def clang_format(file_contents):
  result = exec_cmd(os.path.join(script_dir, clang_format_exe), ".", file_contents)
  if result['out'] != '':
    output = result['out']
    if sys.platform == 'win32':
      # Convert to Unix line endings.
      output = output.replace("\r", "")
    return output
  return None

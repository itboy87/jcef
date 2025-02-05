/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jetbrains.cef.remote.thrift.transport;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import com.jetbrains.cef.remote.thrift.TConfiguration;

public abstract class TNonblockingTransport extends TEndpointTransport {

  public TNonblockingTransport(TConfiguration config) throws TTransportException {
    super(config);
  }

  /**
   * Non-blocking connection initialization.
   *
   * @see java.nio.channels.SocketChannel#connect(SocketAddress remote)
   */
  public abstract boolean startConnect() throws IOException;

  /**
   * Non-blocking connection completion.
   *
   * @see java.nio.channels.SocketChannel#finishConnect()
   */
  public abstract boolean finishConnect() throws IOException;

  public abstract SelectionKey registerSelector(Selector selector, int interests)
      throws IOException;
}

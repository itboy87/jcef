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
package com.jetbrains.cef.remote.thrift;

import com.jetbrains.cef.remote.thrift.async.AsyncMethodCallback;
import com.jetbrains.cef.remote.thrift.protocol.TMessage;
import com.jetbrains.cef.remote.thrift.protocol.TProtocol;
import com.jetbrains.cef.remote.thrift.server.AbstractNonblockingServer;

public abstract class AsyncProcessFunction<I, T extends TBase, R> {
  final String methodName;

  public AsyncProcessFunction(String methodName) {
    this.methodName = methodName;
  }

  protected abstract boolean isOneway();

  public abstract void start(I iface, T args, AsyncMethodCallback<R> resultHandler)
      throws TException;

  public abstract T getEmptyArgsInstance();

  public abstract AsyncMethodCallback<R> getResultHandler(
      final AbstractNonblockingServer.AsyncFrameBuffer fb, int seqid);

  public String getMethodName() {
    return methodName;
  }

  public void sendResponse(
      final AbstractNonblockingServer.AsyncFrameBuffer fb,
      final TSerializable result,
      final byte type,
      final int seqid)
      throws TException {
    TProtocol oprot = fb.getOutputProtocol();

    oprot.writeMessageBegin(new TMessage(getMethodName(), type, seqid));
    result.write(oprot);
    oprot.writeMessageEnd();
    oprot.getTransport().flush();

    fb.responseReady();
  }
}

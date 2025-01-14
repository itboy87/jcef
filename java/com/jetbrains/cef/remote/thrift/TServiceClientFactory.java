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

import com.jetbrains.cef.remote.thrift.protocol.TProtocol;

/**
 * A TServiceClientFactory provides a general way to get a TServiceClient connected to a remote
 * TService via a protocol.
 *
 * @param <T> the type of TServiceClient to get.
 */
public interface TServiceClientFactory<T extends TServiceClient> {
  /**
   * Get a brand-new T using <i>prot</i> as both the input and output protocol.
   *
   * @param prot The protocol to use for getting T.
   * @return A brand-new T using <i>prot</i> as both the input and output protocol.
   */
  T getClient(TProtocol prot);

  /**
   * Get a brand new T using the specified input and output protocols. The input and output
   * protocols may be the same instance.
   *
   * @param iprot The input protocol to use for getting T.
   * @param oprot The output protocol to use for getting T.
   * @return a brand new T using the specified input and output protocols
   */
  T getClient(TProtocol iprot, TProtocol oprot);
}

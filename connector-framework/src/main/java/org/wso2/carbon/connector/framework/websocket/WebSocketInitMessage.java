/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.connector.framework.websocket;

import java.net.ProtocolException;
import java.net.URISyntaxException;
import javax.websocket.Session;

/**
 * This Message is used to handle WebSocket handshake.
 */
public interface WebSocketInitMessage extends WebSocketChannelContext {

    /**
     * Complete the handshake of a given request.
     *
     * @return the Server session for the newly created WebSocket connection.
     * @throws ProtocolException if error occurred while proceeding with the handshake.
     */
    Session handshake() throws ProtocolException;

    /**
     * Cancel the handshake.
     *
     * @param closeCode close code for cancelling the handshake.
     * @param closeReason reason for canceling the handshake.
     */
    void cancelHandShake(int closeCode, String closeReason);
}

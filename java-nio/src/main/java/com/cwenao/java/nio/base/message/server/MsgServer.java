/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.server;

/**
 * @author cwenao
 * @version $Id MsgServer.java, v 0.1 2017-12-19 14:13 cwenao Exp $$
 */
public interface MsgServer {
    void connectListen();

    void dataReceiveListen();
}

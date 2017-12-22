/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpc.rpcwithsocket.server;

import java.io.IOException;

/**
 * @author cwenao
 * @version $Id Server.java, v 0.1 2017-12-21 15:57 cwenao Exp $$
 */
public interface Server {
    void start() throws IOException;

    void stop();

    void register(Class serviceInterface, Class impl);

    boolean isRunning();

    int getPort();
}

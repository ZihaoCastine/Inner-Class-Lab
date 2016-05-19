package io.zihaocastine;

/**
 * Created by zihaocastine on 5/16/16.
 */
public interface Connection {
    String connect();
    String getIP();
    String getPort();
    String getProtocol();
    void close();

}

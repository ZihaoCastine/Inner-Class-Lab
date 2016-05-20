package io.zihaocastine;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class ConnectionDriver {
    public static void main(String[] args) {
        ConnectionManager connection=new ConnectionManager();
        Connection connection1=connection.getConnection("lochhost","8080","HTTP");
        System.out.println(connection1.getIP());
        System.out.println(connection1.getPort());
        System.out.println(connection1.getProtocol());



    }
}

package io.zihaocastine;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 5/17/16.
 */
public class ConnectionSpec {
    @Test
    public void testConnectionLimit(){
        ConnectionManager connectionManager=new ConnectionManager();
        Connection connection1=connectionManager.getConnection("lochhost","8080","HTTP");
        Connection connection2=connectionManager.getConnection("lochhost","8080","TCP");
        Connection connection3=connectionManager.getConnection("lochhost","3030","SSH");
        Connection connection4=connectionManager.getConnection("lochhost","10100","HTTP");
        Connection connection5=connectionManager.getConnection("lochhost","8090","HTTP");
        Connection connection6=connectionManager.getConnection("lochhost","9000","HTTP");
        Assert.assertNotNull(connection1);
        Assert.assertNotNull(connection2);
        Assert.assertNotNull(connection3);
        Assert.assertNotNull(connection4);
        Assert.assertNotNull(connection5);
        Assert.assertNull(connection6);

    }

    @Test
    public void testIP(){
        ConnectionManager connectionManager=new ConnectionManager();
        Connection connection1=connectionManager.getConnection("lochhost","8080","HTTP");
        Assert.assertEquals("lochhost",connection1.getIP());
    }

    @Test
    public void testPort(){
        ConnectionManager connectionManager=new ConnectionManager();
        Connection connection1=connectionManager.getConnection("lochhost","8080","HTTP");
        Assert.assertEquals("8080",connection1.getPort());
    }

    @Test
    public void testProtocol(){
        ConnectionManager connectionManager=new ConnectionManager();
        Connection connection1=connectionManager.getConnection("lochhost","8080","HTTP");
        Assert.assertEquals("HTTP",connection1.getProtocol());
    }

}

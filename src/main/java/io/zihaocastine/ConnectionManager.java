package io.zihaocastine;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class ConnectionManager {

    static int numberOfConnection=0;
    ConnectionManager(String ip, String port, String protocol){
        if(numberOfConnection<10){
            //new ManagedConnection("locohost", "8080","HTTP").connect();
            System.out.println(new ManagedConnection(ip, port,protocol).connect());
        }
        numberOfConnection++;
    }

    private class ManagedConnection implements Connection{
        String IP;
        String Port;
        String Protocol;
        ManagedConnection(String ip, String port, String protocol){
            IP=ip;
            Port=port;
            Protocol=protocol;
        }
        public String getIP() {

            return IP;
        }

        public String getPort() {
            return Port;
        }

        public String getProtocol() {
            return Protocol;
        }

        public String connect() {
            if(getProtocol().equals(null)){
                return null;
            }else {
                return "connect IP: "+IP+" Port: "+Port;
            }
        }

        public void close(){

            numberOfConnection--;
        }

    }
}

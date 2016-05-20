package io.zihaocastine;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class ConnectionManager {

    static int numberOfConnection=0;
    public Connection getConnection(String ip, String port, String protocol){
        if(numberOfConnection<5){
            numberOfConnection++;
            return this.new ManagedConnection(ip, port,protocol);
        }else{
            return null;
        }

    }

    private class ManagedConnection implements Connection{
        String IP;
        String Port;
        String Protocol;
        boolean connected;
        ManagedConnection(String ip, String port, String protocol){
            IP=ip;
            Port=port;
            switch (protocol){
                case "HTTP":
                    Protocol="HTTP";
                    break;
                case "SSH":
                    Protocol="SSH";
                    break;
                case "TCP":
                    Protocol="TCP";
                    break;
                default:
                    Protocol="HTTP";
                    break;
            }
            connected=true;
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
            if(connected){
                return "connect IP: "+IP+" Port: "+Port;
            }else {
                return null;
            }
        }

        public void close(){

            numberOfConnection--;
            connected=false;
        }

    }
}

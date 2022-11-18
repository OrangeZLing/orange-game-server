class TestMain{

    public static void main(String args[]){
        Server serv = new Server("127.0.0.1",3000);
        new ServerRun(serv).start;
    }

}
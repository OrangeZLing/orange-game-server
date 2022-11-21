class ServerRun extends Thread{
    private Server serv;

    public ServerRun(Server serv){
        this.serv = serv;
    }

    public void run(){
        serv.start(Thread.currentThread().getName());
    }

}
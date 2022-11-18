Class Server{

    private String addr;
    private Integer port;

    public Server(String addr,Integer port){
        super();
        this.addr = addr;
        this.port = port;
    }

    public String getAddr(){
        return this.addr;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }
    public Integer getPort(){
        return this.port;
    }
    public void setPort(Integer port){
        this.port = port;
    }

    public void start(String runner){
        System.out.println(runner + " running...")
    }

}
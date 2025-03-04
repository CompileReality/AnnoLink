class Example{
    public void static main(String[] args){
        Example Main = new Example();
        
        Function print = new Function("PrintMessage",Main);
        print.execute(new Object[]{"Hello World."});

        Function getmessage = new Function("getMessage",Main);
        System.out.print(getmessage.execute(new Object[]{"Hello World."}));
    }

    @Executable(key = "PrintMessage")
    public void print(String message){
        System.out.print(message);
    }

    @Executable(key = "getMessage")
    public String get(){
        return "Hello";
    }

}
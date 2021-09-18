

// Creating our thread using Runnable Interface
class mythread implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Value of i is "+i);
            try{
                Thread.sleep(1000);}
                catch(Exception e){
                    System.out.println(e);
                }
        }
    }
     public static void main(String[] args) {
        mythread t1=new mythread();
        
        Thread thr=new Thread(t1);
        another t2=new another();
        thr.start();
        t2.start();
    }
}
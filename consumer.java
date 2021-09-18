public class consumer extends Thread {
    company c;
    consumer(company c){
        this.c=c;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            this.c.consume();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            
        }
    }
}

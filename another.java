

public class another extends Thread{
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("Another thread= "+i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
        }
    }
    public static void main(String[] args) {
        
    }
}

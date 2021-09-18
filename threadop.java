class userthread extends Thread{
    public void run(){
        System.out.println("This is userdefined Thread");
    }
}
class threadop{
public static void main(String[] args){
    System.out.println("Program started.......");
    int x=4+2;
    System.out.println("sum is " +x);
    Thread t=Thread.currentThread();
    String tnam=t.getName();
    System.out.println("Current running thread is ... "+tnam);
    t.setName("My Main");
    System.out.println(t.getName());
    System.out.println(t.getId());
    userthread thread=new userthread();
    thread.start();
}
}
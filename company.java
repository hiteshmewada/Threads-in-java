public class company {
    int n;
    boolean f=false;
    synchronized public void produce (int n) throws Exception{
        if(f) wait();
        this.n=n;
        System.out.println("Produced "+ this.n);
        f=true;
        notify();
    }
    synchronized public int consume()throws Exception{
        if(!f) wait();
        System.out.println("Consumed "+this.n);
        f=false;
        notify();
        return this.n;
    }
}

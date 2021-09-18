
public class main {
     public static void main(String[] args) {
        company comp=new company();
        producer pro=new producer(comp);
        consumer con=new consumer(comp);
        pro.start();
        con.start();
    }
}

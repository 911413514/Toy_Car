package Produce_Consumers;

/**
 * Created by kamen on 2018/3/19.
 */
public class MasterTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        Thread t1=new Thread(new Producer(stack));
        Thread t2=new Thread(new Consumers(stack));
        t1.start();
        t2.start();
    }
}

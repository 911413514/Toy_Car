package Deae_Thread;

/**
 * Created by kamen on 2018/3/20.
 */
public class Dead_Thread {

    /*模拟一个线程死锁*/

    public static void main(String[] args) {

        Object o1=new Object(),o2=new Object();
        Thread t1=new Thread(new A(o1,o2)),t2=new Thread(new B(o1,o2));
        t1.start();
        t2.start();

    }
}

class A implements Runnable{
Object o1=null,o2=null;

    public A(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            System.out.println("o1对象");
            synchronized (o2){
                System.out.println("o2对象");
            }
        }
    }
}

class B implements  Runnable{
    Object o1=null,o2=null;

    public B(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            System.out.println("o2对象");
            synchronized (o1){
                System.out.println("o1对象");
            }
        }
    }
}

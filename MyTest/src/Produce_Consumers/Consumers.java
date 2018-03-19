package Produce_Consumers;

/**
 * Created by kamen on 2018/3/19.
 */
public class Consumers implements Runnable {//消费者,负责吃
    Stack stack=null;

    public Consumers(Stack stack) {
        this.stack = stack;
    }

    public void run(){
        for (int i = 0; i <30 ; i++) {
            Food food=stack.pop();
            System.out.println("目前吃到了第"+food);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

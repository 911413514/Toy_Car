/**
 * Created by kamen on 2018/3/19.
 */
public class Producer implements Runnable{//生产者，需要一个篮子好装东西
    Stack stack=null;

    public Producer(Stack stack) {
        this.stack = stack;
    }


    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            stack.push(new Food(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

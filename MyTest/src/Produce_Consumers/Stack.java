package Produce_Consumers;

/**
 * Created by kamen on 2018/3/19.
 */
public class Stack {//定义一个篮子作为容器
    Food food[]=new Food[10];
    int index=0;


    synchronized void push(Food food){   //执行完成index变成1，食物下标0元素变成food1

        if(index==this.food.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();//唤醒
        this.food[index]=food;
        System.out.println("当前生产了"+this.food[index]);
        index++;

    }

    synchronized Food pop(){  //执行时 index变成0，返回下标为0的食物

        if(index==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;
        return this.food[index];
    }
}

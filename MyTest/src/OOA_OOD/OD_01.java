package OOA_OOD;


import java.util.*;

/**
 * Created by kamen on 2018/3/21.
 */
public class OD_01 {
    public static void main(String[] args) {
        MoreAction dad=new Dad();
        MoreAction gf=new Grandpa();
        List<MoreAction>t1=new ArrayList<>();
        t1.add(dad);
        t1.add(gf);
        new Thread(new Child(t1)).start();


    }
}


//小孩在睡觉——小孩有个类，结合下方醒了(状态)，他自身
//小孩醒了要吃东西，不然就哭——谁的小孩？父母有个类

class Child implements Runnable{
    private List<MoreAction> SomePeopleAction=new ArrayList<MoreAction>();

    public Child(List<MoreAction> somePeopleAction) {
        SomePeopleAction = somePeopleAction;
    }

    /*  Dad dad;//留一个引用
    Grandpa_1 grandpa;
   //-第二版 private boolean isWake =false;//设置权限控制使得小孩状态非可见-第一版


    public Child(Dad dad, Grandpa_1 grandpa) {
        this.dad = dad;
        this.grandpa = grandpa;
    }*/

    void IsWake(){ //定义小孩自身方法改变小孩状态
       // isWake=true;-第二版

        //第三版   小孩醒了以后要做其他的事，不光是吃饭，此时应如何设计

        for (int i = 0; i <SomePeopleAction.size() ; i++) {
            MoreAction action=SomePeopleAction.get(i);
            action.ActionToBaby(new Action("bed",System.currentTimeMillis(),this));
        }
    }

   /*第二版  public boolean isWake() {  //通过方法获取小孩状态
        return isWake;
    }*/

    /* 第二版 public void setWake(boolean wake) {//通过方法改变小孩状态(一般情况下为可读不可写)
        isWake = wake;
    }*/

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.IsWake();
    }
}

class Dad  implements MoreAction{
    @Override
    public void ActionToBaby(Action action) {
        System.out.println("父亲的行为");
    }
   /*  第二版 Child child=null;

    public Dad(Child child) {
        this.child = child;
    }


    @Override
    public void run() {
        while (!child.isWake()){//阻塞方法,通过小孩自身的观察方法获取小孩状态。阻塞方法会一直执行下去，下方代码无机会执行
            try {
                Thread.sleep(1000);//每秒观察状态
            } catch (InterruptedException e) {
                System.out.println("小孩还在睡觉....");
                e.printStackTrace();
            }
        }

        feed(child);//有机会执行时，小孩已经醒来，调用喂食方法
    }*//*

    void ActionToBaby(Action action){ //作为父亲应该做的
        //第三版 if(xxxxx){ 做什么？}
        System.out.println("父亲应该做什么");
    }*/
}

class Grandpa implements MoreAction{
    @Override
    public void ActionToBaby(Action action) {
        System.out.println("爷爷的行为");
    }
  /*  //第三版 if(xxxxx){ 做什么？}
    void ActionToBaby(Action action){  //作为爷爷应该做的
        System.out.println("爷爷做什么");
    }*/
}

class Action{ //定义一个事件
    String address;//第三版 地点
    long time;//第三版 时间
    Object obj;  //第三版 事件源对象

    public Action(String address, long time, Object obj) {
        this.address = address;
        this.time = time;
        this.obj = obj;

    }
}

interface  MoreAction{
    void ActionToBaby(Action action);
}


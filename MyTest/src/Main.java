public class Main {

    public static void main(String[] args) {

    }
}


class A {

    void test(){
        System.out.println("A类方法");
    }
}


class B{
    void  test(){
        System.out.println("B类方法");
    }
}


//实现线程死锁需要满足 两个Synchroized的方法访问两个对象，其中互不相让的场景


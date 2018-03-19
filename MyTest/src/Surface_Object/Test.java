package Surface_Object;

/**
 * Created by kamen on 2018/3/20.
 */
public class Test {
    public static void main(String[] args) {

        Apple apple=new Apple("苹果",1,"脆性",3.14);
        Orange orange=new Orange("桔子",2,"水性",2.18);
        Eat e=new Eat(apple,"张三");
        e.eat();

    }
}

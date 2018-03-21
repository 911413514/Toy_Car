package Interface;

/**
 * Created by kamen on 2018/3/20.
 */
public class Test {
    public static void main(String[] args) {
        SmaillCat smaillCat=new gongren();
        smaillCat.eat("猫粮");
        smaillCat.wan("怎么吸的？？？");

        smaillCat=new guojiaganbu();
        smaillCat.eat("猫粮");
        smaillCat.wan("英短");
    }
}

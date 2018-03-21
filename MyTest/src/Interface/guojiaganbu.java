package Interface;

/**
 * Created by kamen on 2018/3/20.
 */
public class guojiaganbu implements SmaillCat{
    @Override
    public void eat(String str) {
        System.out.println("国家干部的小猫在吃"+str);
    }

    @Override
    public void wan(String str) {
        System.out.println("国家干部家的小猫在和一只"+str+"玩");
    }
}

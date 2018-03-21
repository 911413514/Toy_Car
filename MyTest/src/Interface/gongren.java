package Interface;

/**
 * Created by kamen on 2018/3/20.
 */
public class gongren implements SmaillCat {
    @Override
    public void eat(String str) {
        System.out.println("小猫在吃"+str);
    }

    @Override
    public void wan(String str) {
        System.out.println("工人在吸猫"+str);
    }
}

package Surface_Object;

/**
 * Created by kamen on 2018/3/20.
 */
public class Eat {
    private Food f;
    private String name;

    public Eat(Food f, String name) {
        this.f = f;
        this.name = name;
    }

    void eat(){
        System.out.println(name+"买了：");
        f.eat();
    }
}

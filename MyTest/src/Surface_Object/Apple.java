package Surface_Object;

/**
 * Created by kamen on 2018/3/20.
 */
public class Apple extends Food {
    private  double salary;

    public Apple(String name, int id, String properties, double salary) {
        super(name, id, properties);
        this.salary = salary;
    }

    void eat(){
        System.out.println("水果名："+name);
        System.out.println("编号："+id);
        System.out.println("性质："+Properties);
        System.out.println("价格："+salary);
    }
}

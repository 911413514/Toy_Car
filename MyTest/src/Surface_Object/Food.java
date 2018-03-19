package Surface_Object;

/**
 * Created by kamen on 2018/3/20.
 */
public class Food {
    String name;//成员变量
    int id;//编号
    String Properties;//性质


    public Food(String name, int id, String properties) {
        this.name = name;
        this.id = id;
        Properties = properties;
    }


    void eat(){
        System.out.println("苹果");
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Properties='" + Properties + '\'' +
                '}';
    }
}

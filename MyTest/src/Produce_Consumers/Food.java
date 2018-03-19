package Produce_Consumers;

/**
 * Created by kamen on 2018/3/19.
 */
public class Food {//食物
    int id;

    public Food(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Food_id:" + id;
    }
}

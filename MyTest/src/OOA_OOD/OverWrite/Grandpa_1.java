package OOA_OOD.OverWrite;

/**
 * Created by kamen on 2018/3/21.
 */

/*爷爷类，具有一个爷爷应该具有的行为 哄孙子*/
public class Grandpa_1 implements MoreAction {
    @Override
    public void SomeAction(ActionData actionData) {
        System.out.println("Grandpa is happy");
    }
}

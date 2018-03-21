package OOA_OOD.OverWrite;

/**
 * Created by kamen on 2018/3/21.
 */

/*奶奶类 具有一个奶奶应有的行为*/
public class GrandMother implements MoreAction{
    @Override
    public void SomeAction(ActionData actionData) {
        System.out.println("Grandma Walks...");
    }
}

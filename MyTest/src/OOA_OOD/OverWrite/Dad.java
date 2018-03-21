package OOA_OOD.OverWrite;

/**
 * Created by kamen on 2018/3/21.
 */

/*孩子父亲，具有一个父亲应有的责任，喂孩子吃饭*/
/*重构，实现行为接口*/
public class Dad implements MoreAction{
    @Override
    public void SomeAction(ActionData actionData) {
        System.out.println("父亲喂水喝");
    }
}

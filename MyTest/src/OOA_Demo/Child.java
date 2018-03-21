package OOA_OOD.OverWrite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamen on 2018/3/21.
 */

/*孩子类，拥有一个孩子应该具有的属性*/
public class Child implements Runnable{
    private List<MoreAction>moreActions=new ArrayList<>();

    public Child(List<MoreAction> moreActions) {
        this.moreActions = moreActions;
    }

    void isWake(){
        for (int i = 0; i <moreActions.size() ; i++) {
            MoreAction moreAction=moreActions.get(i);
            moreAction.SomeAction(new ActionData("Bed",System.currentTimeMillis(),this));
        }
    }

    @Override
    public void run() {
        try {
            /*孩子醒过来的时间*/
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isWake();
    }
}

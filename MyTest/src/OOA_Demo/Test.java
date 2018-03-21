package OOA_OOD.OverWrite;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamen on 2018/3/21.
 */


/*程序入口
* 重写 新增反射机制，从本地配置文件读取类名并加载
* 时间 2018.03.21 04:21*/
public class Test {
    static BufferedReader bufferedReader;
    public static void main(String[] args) {
        String file_address="//Users//kamen//Desktop//Test.txt";
        List<MoreAction>People=new ArrayList<>();
        String context=null;
        try {
            FileReader fileReader=new FileReader(file_address);
             bufferedReader=new BufferedReader(fileReader);
            while ((context=bufferedReader.readLine())!=null){

                Class TC=Class.forName(context);
                MoreAction moreAction=(MoreAction)TC.newInstance();
                People.add(moreAction);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

       Child child=new Child(People);
        new Thread(child).start();
    }

}

 /*需求：
* 孩子在睡觉，醒了以后会哭，从而造成一个事件
* 参与人员：父亲，爷爷，奶奶
* 人员行为：自定义(接口)
* 事件：地点，时间，参与人员 */




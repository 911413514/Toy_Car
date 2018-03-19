package Surface_Object;

import java.util.Scanner;

/**
 * Created by kamen on 2018/3/20.
 */
public class ObjectFace1 {
    /*多态初体验*/
    public static void main(String[] args) {
        String str=null;
        O1 o=null;
        Scanner scanner=new Scanner(System.in);
        str=scanner.next();

        if(str.equals("小车")){
            o=new smallCar();
            o.Speed();
        }else if(str.equals("大车")){
            o=new bigCar();
            o.Speed();
        }


    }
}

interface O1{
    void Speed();
}


class smallCar implements O1{

    @Override
    public void Speed() {
        System.out.println("乘坐小车去新疆");
    }
}

class bigCar implements O1{

    @Override
    public void Speed() {
        System.out.println("乘坐大车去新疆");
    }
}
import java.util.ArrayList;
public class IntroArrayList1 {
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<>();
        //Add in ArrayList
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        //Add in ArrayList at a particular index
        list.add(1,12);
        System.out.println(list);

    }
}

import java.util.ArrayList;

public class TuesdayArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(42);
        for (int i = 0; i < 10; i++) {
            list.add(i,i+1);
        }
        list.remove(0);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i < 35; i++) {
            int x = (list.get(i - 1) + list.get(i - 2));
            if(x <=4000000) {
                list.add(x);
            } else {
                break;
            }
        }
            System.out.println(list);
    }


}

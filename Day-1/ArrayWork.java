import java.util.ArrayList;
import java.lang.Integer;

public class ArrayWork {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(2);
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
}

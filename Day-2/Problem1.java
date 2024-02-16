import java.util.ArrayList;

public class Problem1 {

    public static ArrayList<Integer> ReverseArray(ArrayList<Integer> data) {
        int left = 0;
        int right = data.size() - 1;
        while (left < right) {
            int temp = data.get(left);
            data.set(left, data.get(right));
            data.set(right, temp);
            left++;
            right--;
        }
        return data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(4);
        data.add(3);
        data.add(2);
        System.out.println(ReverseArray(data));
    }
}

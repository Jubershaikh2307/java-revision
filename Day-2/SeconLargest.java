import java.util.ArrayList;

public class SeconLargest {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5 };
        int largest = data[0];
        int secondLargest = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > largest) {
                secondLargest = largest;
                largest = data[i];
            }
        }
        System.out.println(largest + " " + secondLargest);

    }
}

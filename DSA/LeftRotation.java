package DSA;

import java.util.Arrays;

class LeftRotation {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5 };
        int rotation = 4;
        int[] temp = new int[rotation];

        for (int i = 0; i < rotation; i++) {
            temp[i] = data[i];
        }

        for (int i = rotation; i < data.length; i++) {
            data[i - rotation] = data[i];
        }

        for (int i = 0; i < rotation; i++) {
            data[data.length - rotation + i] = temp[i];
        }

        System.out.println(Arrays.toString(data));
    }
}
// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte

public class TypeCasting {
    public static void main(String[] args) {
        // This is winding Casting
        int a = 9;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        // Narrow Casting
        double a1 = 9;
        int b1 = (int) a1;
        System.out.println(a1);
        System.out.println(b1);

    }
}

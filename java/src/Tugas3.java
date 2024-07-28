import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        //operasi rational
        System.out.println(a + " == " + b + ": " + booleanKeString(a == b));
        System.out.println(a + " != " + b + ": " + booleanKeString(a != b));
        System.out.println(a + " > " + b + ": " + booleanKeString(a > b));
        System.out.println(a + " < " + b + ": " + booleanKeString(a < b));
        System.out.println(a + " >= " + b + ": " + booleanKeString(a >= b));
        System.out.println(a + " <= " + b + ": " + booleanKeString(a <= b));

        scanner.close();
    }
    public static String booleanKeString(boolean hasil) {
        return hasil ? "benar" : "salah";
    }
}

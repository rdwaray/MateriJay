public class increment {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Unary increment (++)
        a++; // Setelah ini, nilai a menjadi 6
        System.out.println("Nilai a setelah increment: " + a);

        // Unary decrement (--)
        b--; // Setelah ini, nilai b menjadi 2
        System.out.println("Nilai b setelah decrement: " + b);

        // Unary negatif (-)
        int c = -a; // c akan menjadi -6 (nilai negatif dari a)
        System.out.println("Nilai c setelah negatif: " + c);

        // Unary not (!)
        boolean isTrue = true;
        boolean isFalse = !isTrue; // isFalse menjadi false (negasi dari isTrue)
        System.out.println("isFalse setelah not: " + isFalse);

    }
}

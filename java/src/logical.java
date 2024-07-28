public class logical {
    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//
//        // Operator AND (&&)
//        boolean resultAnd = a && b;  // false karena a dan b harus keduanya true untuk hasil true
//
//        // Operator OR (||)
//        boolean resultOr = a || b;   // true karena a atau b (atau keduanya) true untuk hasil true
//
//        // Operator NOT (!)
//        boolean resultNotA = !a;     // false karena !a adalah kebalikan dari a
//
//        // Menampilkan hasil
//        System.out.println("Hasil dari a && b: " + resultAnd);
//        System.out.println("Hasil dari a || b: " + resultOr);
//        System.out.println("Hasil dari !a: " +

        //and
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //or
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //not
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("logical.main : " + ((true && true) && (false || false)));
    }
}

public class relational {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int rela = a - b;

        System.out.println("Hasil Relational : " + (a < rela) );
//        // Operator ==
//        System.out.println("a == b: " + (a == b)); // false, karena 5 tidak sama dengan 3
//
//        // Operator !=
//        System.out.println("a != b: " + (a != b)); // true, karena 5 tidak sama dengan 3
//
//        // Operator >
//        System.out.println("a > b: " + (a > b));   // true, karena 5 lebih besar dari 3
//
//        // Operator <
//        System.out.println("a < b: " + (a < b));   // false, karena 5 tidak kurang dari 3
//
//        // Operator >=
//        System.out.println("a >= b: " + (a >= b)); // true, karena 5 lebih besar atau sama dengan 3
//
//        // Operator <=
//        System.out.println("a <= b: " + (a <= b)); // false, karena 5 tidak kurang atau sama dengan 3

        String[] colors = {"merah", "kuning", "hijau"};

        // Memeriksa apakah terdapat elemen "merah" di dalam array
        for (String color : colors) {
            if (color.equals("merah")) {
                System.out.println("Terdapat warna merah dalam array.");
            }
        }

        // Memeriksa apakah terdapat elemen "kuning" di dalam array
        for (String color : colors) {
            if (color.equals("kuning")) {
                System.out.println("Terdapat warna kuning dalam array.");
            }
        }

        // Memeriksa apakah terdapat elemen "hijau" di dalam array
        for (String color : colors) {
            if (color.equals("hijau")) {
                System.out.println("Terdapat warna hijau dalam array.");
            }
        }
    }
}

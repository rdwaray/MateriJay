public class aritmatik {
    public static void main(String[] args) {
        // Operasi aritmatika
        int a = 10;
        int b = 3;
        int c = a + b;  // Penjumlahan
        int d = a - b;  // Pengurangan
        int e = a * b;  // Perkalian
        int f = a / b;  // Pembagian (hasil int)
        int g = a % b;  // Modulus

        // Penjumlahan string
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;

        // Penjumlahan string dan integer
        String strInt = str1 + a;

        // Operasi aritmatik dengan float
        float floatResult = (float) a / b;

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + c);
        System.out.println("Hasil pengurangan: " + d);
        System.out.println("Hasil perkalian: " + e);
        System.out.println("Hasil pembagian: " + f);
        System.out.println("Hasil modulus: " + g);
        System.out.println("Hasil penjumlahan string: " + str3);
        System.out.println("Hasil penjumlahan string dan int: " + strInt);
        System.out.println("Hasil operasi aritmatik dengan float: " + floatResult);

        int hasilPenjumlahan = 1 + 2 + 3;
        System.out.println(hasilPenjumlahan);

        int hasilPengurangan = 20 - 1 - 3;
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        int hasilPerkalian = 231 * 2312;
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println(2 * 4);

        //modulus
        System.out.println("Modulus : " + 20 % 3);

        //pengurangan float
        float pengurangaFloat = 1.4f - 0.523f;
        String formattedResult = String.format("%.2f", pengurangaFloat);
        System.out.println(formattedResult);
    }
}

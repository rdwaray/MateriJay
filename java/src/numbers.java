package variables;
import java.util.Arrays;

public class numbers {

    public static void main(String[] args) {
        short umur = 100;
        int hargaBarang = 100000;
        long hargaPulau = 1929999999L; // Note the 'L' suffix for long literals
        float nilaiDesimal1 = 2931.44f; // Note the 'f' suffix for float literals
        double nilaiDesimal2 = 23.3333333333;

        System.out.println(umur);
        System.out.println(hargaBarang);
        System.out.println(hargaPulau);
        System.out.println(nilaiDesimal1);
        System.out.println(nilaiDesimal2);

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Apakah Java menyenangkan? " + isJavaFun);
        System.out.println("Apakah ikan enak? " + isFishTasty);

        if (isJavaFun) {
            System.out.println("Java adalah bahasa pemrograman yang menyenangkan!");
        } else {
            System.out.println("Java tidak menyenangkan?");
        }

        if (isFishTasty) {
            System.out.println("Ikan ini enak.");
        } else {
            System.out.println("Ikan ini tidak enak.");
        }

        int number = 25;
        boolean isGreaterThanTen = number > 10;
        boolean isLessThanFifty = number < 50;

        // Menggunakan boolean dalam if statement
        if (isGreaterThanTen) {
            System.out.println("Angka " + number + " lebih besar dari 10");
        }

        if (isLessThanFifty) {
            System.out.println("Angka " + number + " kurang dari 50");
        }

        // Kombinasi boolean dan perbandingan langsung
        if (isGreaterThanTen && isLessThanFifty) {
            System.out.println("Angka " + number + " lebih besar dari 10 dan kurang dari 50");
        }

        // Contoh inversi boolean
        boolean isNotEqualThirty = number != 30;
        if (isNotEqualThirty) {
            System.out.println("Angka " + number + " tidak sama dengan 30");
        }
        // Deklarasi variabel bertipe string
        String firstName = "John";
        String lastName = "Doe";

        // Menggabungkan string menggunakan operator +
        String fullName = firstName + " " + lastName;
        System.out.println("Nama lengkap: " + fullName);

        // Metode upper case untuk mengubah string menjadi huruf kapital
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Nama lengkap dalam huruf kapital: " + upperCaseFullName);

        // Metode lower case untuk mengubah string menjadi huruf kecil
        String lowerCaseFullName = fullName.toLowerCase();
        System.out.println("Nama lengkap dalam huruf kecil: " + lowerCaseFullName);

        // Metode concat untuk menggabungkan string dengan string lain
        String greeting = "Hello, ";
        String message = greeting.concat(fullName);
        System.out.println("Pesan: " + message);

        // Menggunakan charAt untuk mendapatkan karakter pada indeks tertentu
        char firstChar = firstName.charAt(0);
        System.out.println("Karakter pertama dari nama depan: " + firstChar);

        // Menggunakan length untuk mendapatkan panjang string
        int fullNameLength = fullName.length();
        System.out.println("Panjang nama lengkap: " + fullNameLength);

}
}

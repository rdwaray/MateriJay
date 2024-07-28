public class Tugas14 {

    public static boolean areAnagrams(String strA, String strB) {
        // Mengubah kedua string ke huruf kecil untuk memperlakukan tidak peka terhadap huruf besar-kecil
        strA = strA.toLowerCase();
        strB = strB.toLowerCase();

        // Jika panjang kedua string berbeda, langsung kembalikan false
        if (strA.length() != strB.length()) {
            return false;
        }

        // Menggunakan array untuk menghitung frekuensi masing-masing karakter (asumsi hanya huruf a-z)
        int[] charCount = new int[26]; // karena hanya ada 26 huruf dalam alfabet

        // Menghitung frekuensi karakter dalam strA
        for (int i = 0; i < strA.length(); i++) {
            char ch = strA.charAt(i);
            charCount[ch - 'a']++;
        }

        // Mengurangi frekuensi karakter dalam strB
        for (int i = 0; i < strB.length(); i++) {
            char ch = strB.charAt(i);
            charCount[ch - 'a']--;
        }

        // Memeriksa apakah semua frekuensi karakter nol setelah dikurangi
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        // Jika semua frekuensi karakter sama, maka strA dan strB adalah anagram
        return true;
    }

    public static void main(String[] args) {
        String strA = "CAT";
        String strB = "tad";

        boolean result = areAnagrams(strA, strB);
        System.out.println("Are '" + strA + "' and '" + strB + "' anagrams? " + result); // Output: true
    }
}
//Buatlah metode yang memiliki tipe pengembalian boolean untuk memeriksa apakah dua stringadalah anagram.
// String A dan String B adalah anagram jika mengandung karakter yang sama dalam frekuensi yang sama.
// String tidak peka huruf besar-kecil. Misalnya, anagram CAT adalah CAT, ACT, tac, TCA, aTC, dan CtA.
// Jadi, jika inputnya adalah String A = “CAT” dan String B = “tac”, metode akan mengembalikan “true”.
//Kriteria :
//Metode akan memiliki tipe pengembalian boolean
//Metode akan memiliki 2 parameter String
import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        // Contoh list integer
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(9);
        numberList.add(1);
        numberList.add(7);

        // Contoh list string
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Grape");
        fruitList.add("Pineapple");

        // Menampilkan list integer
        System.out.println("List integer:");
        printIntegerList(numberList);

        // Menampilkan list string
        System.out.println("\nList string:");
        printStringList(fruitList);

        // Modifikasi list integer
        numberList.set(2, 10); // Mengubah nilai indeks ke-2 menjadi 10
        numberList.remove(4);  // Menghapus elemen pada indeks ke-4

        // Modifikasi list string
        fruitList.add(2, "Cherry"); // Menambahkan "Cherry" pada indeks ke-2
        fruitList.remove("Orange"); // Menghapus "Orange" dari list

        // Menampilkan list integer setelah dimodifikasi
        System.out.println("\nList integer setelah dimodifikasi:");
        printIntegerList(numberList);

        // Menampilkan list string setelah dimodifikasi
        System.out.println("\nList string setelah dimodifikasi:");
        printStringList(fruitList);
    }

    // Metode untuk mencetak list integer
    public static void printIntegerList(List<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Metode untuk mencetak list string
    public static void printStringList(List<String> list) {
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

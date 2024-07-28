import java.util.Arrays;

public class arrary {

    public static void main(String[] args) {
        // Contoh array integer
        int[] numbers = {5, 3, 9, 1, 7};

        // Contoh array string
        String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Pineapple"};

        // Contoh array dua dimensi (array of array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Menggunakan loop for untuk mencetak elemen array integer
        System.out.println("Elemen array integer:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Menggunakan loop for untuk mencetak elemen array string
        System.out.println("\nElemen array string:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Menggunakan loop for untuk mencetak elemen array dua dimensi
        System.out.println("\nElemen array dua dimensi (array of array):");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Memanggil metode untuk mengurutkan array integer
        sortIntArray(numbers);
        System.out.println("\nElemen array integer setelah diurutkan:");
        printIntArray(numbers);

        // Memanggil metode untuk mengurutkan array string
        Arrays.sort(fruits);
        System.out.println("\nElemen array string setelah diurutkan:");
        printStringArray(fruits);
    }

    // Metode untuk mengurutkan array integer
    public static void sortIntArray(int[] array) {
        Arrays.sort(array);
    }

    // Metode untuk mencetak array integer
    public static void printIntArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Metode untuk mencetak array string
    public static void printStringArray(String[] array) {
        for (String fruit : array) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

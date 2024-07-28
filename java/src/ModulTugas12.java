import java.util.Scanner;

public class ModulTugas12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai rentang 1 - 10: ");
        int nomor = scanner.nextInt();

        if (nomor >= 1 && nomor <= 10) {
            if (nomor % 2 == 0){
                System.out.println(nomor + " adalah bilangan genap");
            } else {
                System.out.println(nomor + " adalah bilangan ganjil");
            }
        } else {
            System.out.println("Angka diluar jangkauan");
        }
    }
}
//
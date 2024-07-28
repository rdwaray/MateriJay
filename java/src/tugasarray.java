import java.util.Arrays;
    public class tugasarray {

        public static void main(String[] args) {


            String[] merkMobil = {"Misubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};
            //coba sorting
            Arrays.sort(merkMobil);
            for (String merk : merkMobil) {
                System.out.print(merk + " ");
            }
            System.out.println();
        }
}
public class Tugas13 {
    public static void main(String[] args) {
        String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

        for (String colour : warna) {
            System.out.println("Warnanya adalah : " + colour);
        }
        System.out.println();
        for (String colour : warna){
            if (colour == "putih"){
                continue;
            }
            System.out.println("Warnanya adalah : " + colour);
        }
    }
}

public class Mobil {

    String merk, warna, tipe;
    int kapasitasBensin;

    public Mobil (String merk, String warna, String tipe, int kapasitasBensin) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.kapasitasBensin = kapasitasBensin;
    }
    public void gas(){
        System.out.println("Brmmm");
    }
    public void rem(){
        System.out.println("Ckittt");
    }
    public void wiper(){
        System.out.println("Wusgg");
    }
}
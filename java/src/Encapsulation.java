class Siswa {
    private String nama;

    // Getter for nama
    public String getNama() {
        return this.nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.setNama("Ray");

        System.out.println(siswa1.getNama());
    }
}

public class classMobil{
    public static void main(String[] args) {
        Mobil hondaJazz = new Mobil("Honda", "Merah", "Jazz", 1660);
        System.out.println(hondaJazz.warna);
        System.out.println(hondaJazz.kapasitasBensin);
        hondaJazz.gas();
        hondaJazz.rem();
        hondaJazz.wiper();
    }
}

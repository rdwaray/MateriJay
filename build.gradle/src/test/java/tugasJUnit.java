import org.junit.jupiter.api.*;

public class tugasJUnit {
    private static int no1;
    private static int no2;

    @BeforeAll
    public static void beforeAll(){
        no1 = 7;
        no2 = 3;
    }
    @Test
    public void testPenambahan(){
        int hasil = tambah(no1,no2);
        Assertions.assertEquals(10,hasil,"Hasil penjumlahan harus sama dengan 10");}

    public static int tambah(int a, int b) {
        return a + b;
    }
    @Test
    public void testPengurangan(){
        int hasil = kurang(no1,no2);
        Assertions.assertEquals(4,hasil,"Hasil pengurangan harus sama dengan 7");}

    public static int kurang(int a, int b) {
        return a - b;
    }
    @Test
    public void testPerkalian(){
        int hasil = kali(no1,no2);
        Assertions.assertEquals(21,hasil,"Hasil perkalian harus sama dengan 21");}

    public static int kali(int a, int b) {
        return a * b;
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Eksekusi after each");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Eksekusi after all");
    }
}
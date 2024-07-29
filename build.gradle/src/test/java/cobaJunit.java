import org.junit.jupiter.api.*;

public class cobaJunit {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Eksekusi before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Eksekusi after all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Eksekusi before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Eksekusi after each");
    }

    @Test
    public void testPenjumlahan() {
        System.out.println("Eksekusi jumlah");
        Assertions.assertEquals(4, 2 + 2);
    }
    @Test
    public void testPengurangan() {
        System.out.println("Eksekusi kurang");
        Assertions.assertEquals(3, 5 - 2);
    }
}

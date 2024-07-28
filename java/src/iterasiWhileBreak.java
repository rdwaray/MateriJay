public class iterasiWhileBreak {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println("Nilai i: " + i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}

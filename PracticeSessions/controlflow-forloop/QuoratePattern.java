public class QuoratePattern {
    public static void main(String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("Q ");
            }
            System.out.println();
        }
    }

}

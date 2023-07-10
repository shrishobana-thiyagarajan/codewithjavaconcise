public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            int number = 1;

            // Print spaces for left indentation
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

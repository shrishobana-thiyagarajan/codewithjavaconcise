// MultiplicationTable
public class forloop {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

}

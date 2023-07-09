import java.util.Scanner;


    public class getUserInput {
        public static void main(String[] args)
        {
            Scanner scanner= new Scanner(System.in);

            System.out.println("What is Scanner Class");
            String answer= scanner.nextLine();
            System.out.println("How to declare scanner class");
            String answer2=scanner.nextLine();
            System.out.println("Scanner Class means "+answer);
            System.out.println("Declare like"+answer2);

        }
    }


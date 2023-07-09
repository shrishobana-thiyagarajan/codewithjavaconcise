import java.util.Scanner;
public class ifstatement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x value");
        int x=sc.nextInt();
        System.out.println("Enter the y value");
        int y=sc.nextInt();
        if(x>y) {
            System.out.println("X is greater than Y");
        }
        else if(x==y){
            System.out.println("x equal to y");

        }else {
            System.out.println("Y is greater than x");
        }


    }





}


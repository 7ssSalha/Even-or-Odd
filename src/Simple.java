import java.util.Scanner;

public class Simple {
    public static void main(String[] args){

        int num;
        int x;
        System.out.println("Enter an Integer number:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("Entered number is even");
        }
        else {
            System.out.println("Entered number is odd");
        }
        System.out.println("program end");
        System.out.println("x1");
        System.out.println("x2");
    }
}

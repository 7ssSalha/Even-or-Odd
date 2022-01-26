import java.util.Scanner;

public class Simple {
    public static void main(String[] args){

        int num;
        int y;
        System.out.println("Enter an Integer number:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("Entered number is even");
        }
        else {
            System.out.println("Entered number is odd");
        }
        System.out.println("this is the end");
        System.out.println("END GAME");
    }
}

import java.util.Scanner;

/*
 * Created by Dave on 2/3/17.
 */
public class Lab4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = scan.nextDouble();

        System.out.println("Enter another number: ");
        double y = scan.nextDouble();

        double sum = x + y;
        double diff = x - y;
        double product = x * y;
        double quot = x / y;
        double modulo = x % y;


        System.out.printf("Sum: %22.2f\n", sum);
        System.out.printf("Difference: %15.2f\n", diff);
        System.out.printf("Product: %18.2f\n", product);
        System.out.printf("Quotient: %17.2f\n", quot);
        System.out.printf("Modulo: %19.2f\n", modulo);
    }
}

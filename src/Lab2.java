/*
 * Created by Dave on 2/3/17.
 */

import java.util.Scanner;
import java.util.StringJoiner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scan.nextLine();

        System.out.print("Enter your height in inches: ");
        double height = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter an adjective to describe yourself: ");
        String adjective = scan.nextLine();

        System.out.print(name + " is a " + adjective + " " + color + " " + age + " year old who is "
        + height + " inches tall");
    }
}

import java.util.Scanner;

/**
 * Created by Dave on 2/3/17.
 */
public class Lab3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your grade: ");
        int grade = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your date of birth: ");
        String dob = scan.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = scan.nextDouble();
        scan.nextLine();

        System.out.print("Do you like icecream ? Enter true or false ");
        boolean icecream = scan.nextBoolean();


        System.out.println("/-----------------------\\");
        System.out.printf("| %-10s %-10s %s\n", "Name: ", name, "|");
        System.out.printf("| %-10s %-10d %s\n", "Age: ", age, "|");
        System.out.printf("| %-10s %-10d %s\n", "Grade: ", grade, "|");
        System.out.printf("| %-10s %-10s %s\n", "DoB: ", dob, "|");
        System.out.printf("| %-10s %-10.1f %s\n", "GPA: ", gpa, "|");
        System.out.printf("| %-10s %6s\n", "Likes Ice Cream?", "|");
        System.out.printf("| %-10s %-10s %s\n", " ", icecream, "|"); //The string that is only a space is a placeholder for aligning 'ice'
        System.out.println("\\-----------------------/");
    }
}

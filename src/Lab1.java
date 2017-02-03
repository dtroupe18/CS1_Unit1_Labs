/**
 * Created by Dave on 2/3/17.
 */
public class Lab1 {

    public static void main(String[] args) {

        int chem = 4;
        int physics = 8;
        int music = 2;
        int math = 12;

        int total = chem + physics + music + math;
        double avg = (double)total/4;

        System.out.println("Chemistry: " + chem);
        System.out.println("Physics: " + physics);
        System.out.println("Music: " + music);
        System.out.println("Math Lab: " + math);

        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

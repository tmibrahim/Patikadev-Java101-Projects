import java.util.Scanner;
public class GradeCalc {
    public static void main(String[] args) {
        //Create Variables
        int mat, physics, chemistry, turkce, history, music;

        //Define Scanner Class
        Scanner inp = new Scanner(System.in);

        //Take inputs form user
        System.out.print("Math Grade :");
        mat = inp.nextInt();

        System.out.print("Physics Grade :");
        physics = inp.nextInt();

        System.out.print("Chemisrty Grade :");
        chemistry = inp.nextInt();

        System.out.print("Turkish Grade :");
        turkce = inp.nextInt();

        System.out.print("History Grade :");
        history = inp.nextInt();

        System.out.print("Music Grade :");
        music = inp.nextInt();

        int sum = (mat + physics + chemistry + turkce + history + music);
        double average = sum / 6;

        System.out.println("Your Average Grade :" + average );

        boolean condition =  average > 60;

        String result = condition ? "You Are Pass!" : "You Didn't Pass!";

        System.out.println(result);

    }
}

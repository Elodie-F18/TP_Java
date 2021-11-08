import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

       int age;
        System.out.print("Quel âge avez-vous ? : ");
        age = keyboard.nextInt();

        int today;
        System.out.printf("On est en quelle année ? :");
        today = keyboard.nextInt();

        int annee = today - age;
        System.out.printf("Votre année de naissance : %d", annee);

    }
}
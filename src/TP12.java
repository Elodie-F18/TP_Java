import java.util.Objects;
import java.util.Scanner;

public class TP12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisir votre mail : ");
        String email = keyboard.nextLine();

        System.out.print("Saisir votre mot de passe : ");
        String password = keyboard.nextLine();

        String emailToLog = "";
        String passwordToLog ="";

        int count =0;


        while(count<5 && (!Objects.equals(emailToLog, email) || !Objects.equals(passwordToLog, password))) {
            System.out.print("Ecrire de nouveau votre adresse mail :");
            emailToLog = keyboard.nextLine();
            System.out.print("Ecrire de nouveau votre mot de passe :");
            passwordToLog = keyboard.nextLine();
            count=count+1;
            if (!Objects.equals(emailToLog, email) || !Objects.equals(passwordToLog, password)) {
                System.out.print("Identifiant incorrect");
            } else {
                System.out.print("Identifiant correct, bienvenue dans votre espace client");
            }
            if (count==5) {
                System.out.print("Vous avez dépassé les 5 essais, votre compte est bloqué");
            }
        }

    }
}





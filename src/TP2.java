import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = keyboard.nextLine();

        System.out.print("Entrez votre prenom : ");
        String prenom = keyboard.nextLine();

        System.out.print("Entrez votre age : ");
        int age = keyboard.nextInt();

        System.out.println("Vous vous appellez "+nom+" "+prenom+" , et vous avez "+age+" ans");
    }
}

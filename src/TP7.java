import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un nombre :");
        int number = keyboard.nextInt();

        //Verifie si nombre = 0
        if (number == 0) {
            System.out.println("Le nombre est zéro (et il est pair)");
        } else {
            // S'il n'est pas nul, quel est son signe
            if (number < 0) {
                System.out.print("Le nombre est négatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }

            // Teste la parité: si le reste de la division par deux est zéro
            // alors le nombre est pair
            int reste = number % 2;
            if (reste == 0) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
        }
    }
}

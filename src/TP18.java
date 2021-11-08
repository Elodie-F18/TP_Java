import java.util.Scanner;

public class TP18 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisir une phrase ou un mot : ");
        String phrase = keyboard.nextLine();

        System.out.println("Votre chaine :"+phrase);
        StringBuilder phraseInverse = new StringBuilder(phrase);
        phrase = phraseInverse.reverse().toString();
        System.out.println("Résulat : "+phrase);

        //Ou
        /*
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisir une phrase ou un mot : ");
        String phrase = keyboard.nextLine();
        String inversePhrase="";

        for(int i=0;i<phrase.length();i++){
            char c1=phrase.charAt(phrase.length()-i-1);
            c1 + inversePhrase;
        }
        System.out.println(inversePhrase);
         */
    }
}

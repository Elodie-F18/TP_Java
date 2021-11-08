import java.util.Scanner;

public class TP22 {
    public static void main(String[] args) {

        //Saisie
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saisissez votre phrase : ");
        String phrase = keyboard.nextLine();

        //Traitement
        for (int i = 0; i < phrase.length(); i++) {
            if ((i == 0)){
                phrase = phrase.substring(0,i) + phrase.substring(i,i+1).toUpperCase() +phrase.substring(i+1);
            }else {
                if (phrase.charAt(i-1) == ' '){
                    phrase = phrase.substring(0,i) + phrase.substring(i,i+1).toUpperCase() +phrase.substring(i+1);
                }
            }
        }

        //Affichage
        System.out.println(phrase);


        /*
        Scanner clav=new Scanner(System.in);
        System.out.print("Votre texte : ");
        String str=clav.nextLine();
        String result = str.valueOf(str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == ' ') {
                result += str.valueOf(str.charAt(i)).toUpperCase();
            } else {
                result += str.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
         */
    }
}

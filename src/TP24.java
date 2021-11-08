import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Combien d'élement à entrez dans le tableau ? : ");
        int nbrElement = keyboard.nextInt();

        ArrayList<String> nomsLangages=new ArrayList<>();

        for(int i=0;i<nbrElement;i++){
            System.out.printf("Entrez le langage %d : ",(i+1));
            //String langage= keyboard.next();
            nomsLangages.add(keyboard.next().toLowerCase());
        }

        System.out.print("Combien d'élement voulez-vous supprimer ? : ");
        int nbrElementRemove = keyboard.nextInt();

        for(int i=0;i<nbrElementRemove;i++){
            System.out.printf("Saisir le nom de l'élément à supprimer :", i+1);
            String elementRemove = keyboard.next();
            //nomsLangages.remove(elementRemove);
            nomsLangages.removeIf(lang -> Objects.equals(lang, elementRemove));
        }

        System.out.println("Votre tableau avant suppression : " +nomsLangages);
        System.out.println("Tableau après suppression : " + nomsLangages);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class TP15 {
    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);

        int tab1Taille, tab2Taille, tab3Taille;
        int tab1[];
        int tab2[];
        int tab3[];

        // Saisir la taille tableau */
        System.out.print("Saisir le nombre d'éléments du premier tableau : ");
        tab1Taille = clavier.nextInt();

        // intialiser la taille du tableau
        tab1 = new int[tab1Taille];

        // Saisir les éléments du tableau tab */
        for (int i = 0; i < tab1Taille; i++) {
            System.out.print("Elément " + (i + 1) + " : ");
            tab1[i] = clavier.nextInt();
        }

        // afficher les éléments du tableau tab
        /*for (i = 0; i < tab1Taille; i++) {
            System.out.print(tab1[i] + ", ");
        }*/

        System.out.println("\n\n");

        // Saisir la taille du tableau */
        System.out.print("Saisir le nombre d'éléments second tableau : ");
        tab2Taille = clavier.nextInt();

        // intialiser la taille du tableau
        tab2 = new int[tab2Taille];

        // Saisir les éléments du tableau tab */

        for (int i = 0; i < tab2Taille; i++) {
            System.out.print("Elément " + (i + 1) + " : ");
            tab2[i] = clavier.nextInt();
        }

        System.out.println("\n\n");

        // Saisir la taille du tableau */
        System.out.print("Saisir le nombre d'éléments second tableau : ");
        tab3Taille = clavier.nextInt();

        // intialiser la taille du tableau tab
        tab3 = new int[tab3Taille];

        // Saisir les éléments du tableau tab */

        for (int i = 0; i < tab3Taille; i++) {
            System.out.print("Elément " + (i + 1) + " : ");
            tab3[i] = clavier.nextInt();
        }



        System.out.println("Tableau 1 : " + Arrays.toString(tab1));
        System.out.println("Tableau 2 : " + Arrays.toString(tab2));
        System.out.println("Tableau 3 : " + Arrays.toString(tab3));


    }
}

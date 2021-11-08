import java.util.Scanner;

public class TP14 {
    public static void main(String[] variables) {
        Scanner keyboard = new Scanner(System.in);

        int[] tab;
        tab  = new int[10] ;
        int i, j, compteur, valeur=0, frequence=0 ;

        for(i=0; i<tab.length; i++){
            System.out.printf("Enter element %d :", i+1);
            tab[i] = keyboard.nextInt();
        }

        for (i=0; i < tab.length; i++){
            compteur = 0 ;
            for (j = 0 ; j < tab.length; j++){
                if ( tab [i] == tab [j]) {
                    compteur++ ;
                }
            }
            if  (compteur > frequence) {
                frequence = compteur ;
                valeur = tab[i] ;
            }
        }
        System.out.println("Element le plus frequent : "+valeur+" apparait "+frequence+ " fois");



    }
}

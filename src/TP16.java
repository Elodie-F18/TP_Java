import java.util.Scanner;
//import java.util.Arrays;

public class TP16 {
    public static void main(String[] variables) {

        Scanner keyboard = new Scanner(System.in);

        int[] tab;
        tab  = new int[5] ;


        for(int i=0; i<tab.length; i++){
            System.out.printf("Enter element %d :", i+1);
            tab[i] = keyboard.nextInt();
        }

        int nmbrMin = tab[0];
        int nmbrMax = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > nmbrMax) {
                nmbrMax = tab[i];
            }
            if (tab[i] < nmbrMin) {
                nmbrMin = tab[i];
            }
        }


        System.out.printf("Tableau : [%d",tab[0]);
        if (tab[0] == nmbrMin){System.out.print("(PP)");}
        else if (tab[0] == nmbrMax){System.out.print("(PG)");}
        for (int i = 1; i<tab.length; i++) {
            System.out.printf(", %d",tab[i]);
            if (tab[i] == nmbrMin){System.out.print("(PP)");}
            else if (tab[i] == nmbrMax){System.out.print("(PG)");}
        }
        System.out.printf("]");
        /*System.out.println("Tableau: " + Arrays.toString(tab));*/
        System.out.print("\nPlus grand nombre = "+nmbrMax);
        System.out.print("\nPlus petit nombre = "+nmbrMin);


    }
}
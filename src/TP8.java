import java.util.Scanner;

public class TP8 {
    public static void main(String[] args) {
        // Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entre le nombre a : ");
        int a =  keyboard.nextInt();

        System.out.print("Entre le nombre b : ");
        int b =  keyboard.nextInt();

        System.out.print("Entre le nombre c : ");
        int c =  keyboard.nextInt();

        double delta = Math.pow(b, 2) - 4*a*c;
        if (delta<0){
            System.out.println("Pas de solution");
        } else {
            System.out.println("La valeur est : "+delta);
        }



    }
}

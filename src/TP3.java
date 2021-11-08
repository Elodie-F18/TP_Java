import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez la première valeur(a) : ");
        int a = keyboard.nextInt();

        System.out.print("Entrez la deuxième valeur(b) : ");
        int b = keyboard.nextInt();

        System.out.print("Entrez la troisième valeur(c) : ");
        int c = keyboard.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d b=%d c=%d" ,a,b,c);

        int attente = a;
        a = c;
        c = b;
        b = attente;


        System.out.printf("Les valeurs permutées sont : a = %d b=%d c=%d" ,a,b,c);
    }
}

import java.util.Scanner;

public class TP20 {
    public static void main(String[] args) {
        int nbr, r = 0;
        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextInt();
        while(nbr != 0) //tant que nombre différent de 0
        {
            r = r * 10;
            r = r + nbr%10;
            nbr = nbr/10;
        }
        System.out.println("L'inverse du nombre est " + r);

    }
}

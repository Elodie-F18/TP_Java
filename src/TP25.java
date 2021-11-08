import java.util.ArrayList;
import java.util.Scanner;

public class TP25 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir  une liste de nombres pour les garder dans un tableau.
        // Il faut noter que les nombres peuvent se repeter
        // Ensuite le programme devra demander à l’utilisateur de spécifier le nombre qu’il retirer du tableau.
        // Le programme va ensuite afficher le tableau avant et après la suppression de toutes les occurrence du nombre spécifié.

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numberArray = new ArrayList<>();

        System.out.print("Entrez la taille du tableau : ");
        int arraySize = keyboard.nextInt();
        for(int i=0; i<arraySize; i++){
            System.out.printf("Entrez le nombre %d : ", i+1);
            numberArray.add(keyboard.nextInt());
        }
        System.out.println("Tableau avant suppression du nombre : " + numberArray);

        System.out.print("Quel nombre voulez-vous retirer du tableau ? ");
        int numberToRemove = keyboard.nextInt();
        for (int i=0; i<arraySize; i++){
            numberArray.removeIf(n -> n==numberToRemove);
        }
        System.out.println("Tableau après suppression du nombre : " + numberArray);


        //OU
        /*
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Integer> nombresOcc=new ArrayList<>();
        ArrayList<Integer> nombresOccsanssuppresion=new ArrayList<>();
        Scanner keyb=new Scanner(System.in);
        System.out.print("Combien de nombres vous entrez? :");
        int nombre=keyb.nextInt();
        //recuperation des nombres
        for(int i=0;i<nombre;i++){
            System.out.printf("Entrez le nombre %d : ",(i+1));
            nombresOcc.add(keyb.nextInt());
        }

        //        Affiche les nombres
        for(int i=0;i<nombresOcc.size();i++){
            System.out.printf("Nombre %d : %d\n",(i+1),nombresOcc.get(i));
        }

        for(int i=0;i<nombresOcc.size();i++){

            nombresOccsanssuppresion.add(nombresOcc.get(i));
        }

        System.out.println("Entrez le nombre a supprimer : ");
        int nombreASupprimer =keyboard.nextInt();
        for(int i=0;i<nombresOcc.size();i++){


            if((nombresOcc.get(i)).equals(nombreASupprimer)){
                nombresOcc.removeIf(lang -> Objects.equals(lang, nombreASupprimer));
            }

        }

        for(int k=0;k<nombresOccsanssuppresion.size();k++){
            System.out.printf("Language %d : %s\n",(k+1),nombresOccsanssuppresion.get(k));
        }
        System.out.println("le tableaux avec les elements supprimer ");
        for(int b=0;b<nombresOcc.size();b++){
            System.out.printf("Language %d : %s\n",(b+1),nombresOcc.get(b));
        }
         */
    }
}

import java.util.Scanner;

public class TP19 {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un texte : ");
        String text = keyboard.nextLine();

        // On convertit l'original en minuscules pour éviter
        String test = text.toLowerCase();

        // On ne garde que les caractères alphabétiques
        String allowedList = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        test = temp;

        // On teste si mot2 est un palindrôme
        int leftPos = 0;
        int rightPos = test.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (test.charAt(leftPos) != test.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("C'est un palindrôme !");
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }

    }
}

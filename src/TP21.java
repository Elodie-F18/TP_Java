import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisir le premier mot :");
        String mot1 = clavier.nextLine();
        System.out.println("Saisir le deuxième mot :");
        String mot2 = clavier.nextLine();
        HashMap<Character, Integer> occurences = new HashMap<>();
        HashMap<Character, Integer> occurences2 = new HashMap<>();

        for (int i = 0; i < mot1.length(); i++) {
            if (occurences.get(mot1.charAt(i)) == null) {
                occurences.put(mot1.charAt(i), 1);
            } else {
                occurences.replace(mot1.charAt(i), occurences.get(mot1.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < mot2.length(); i++) {
            if (occurences2.get(mot2.charAt(i)) == null) {
                occurences2.put(mot2.charAt(i), 1);
            } else {
                occurences.replace(mot2.charAt(i), occurences2.get(mot2.charAt(i)) + 1);
            }
        }
        occurences.remove(' ');
        occurences2.remove(' ');
        System.out.println(occurences);
        System.out.println(occurences2);
        if (Objects.equals(occurences, occurences2))
        {
            System.out.println("c'est un anagramme");
        }else{
            System.out.println("ce n'est pas un anagramme");
        }
    }
}

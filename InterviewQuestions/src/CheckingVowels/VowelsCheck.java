package CheckingVowels;

import java.util.Scanner;

public class VowelsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (containsVowel(input)) {
            System.out.println("The string contains a vowel.");
        } else {
            System.out.println("The string does not contain a vowel.");
        }

        scanner.close();
    }

    public static boolean containsVowel(String str) {
        str = str.toLowerCase();
        return str.matches(".*[aeiou].*");
    }
}

	



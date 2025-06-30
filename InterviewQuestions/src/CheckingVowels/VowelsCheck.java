package CheckingVowels;

import java.util.Scanner;

public class VowelsCheck {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        if (containsVowel(input)) {
//            System.out.println("The string contains a vowel.");
//        } else {
//            System.out.println("The string does not contain a vowel.");
//        }
//
//        scanner.close();
//    }
    	  System.out.println(m1("Hello"));
          System.out.println(m1("Tv"));
    }

    public static boolean m1(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

	



import java.util.Scanner;

public class StringAnalysis {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Calling method to analyze the string
        analyzeString(input);
        
        scanner.close();
    }
    
    public static void analyzeString(String str) {
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        
        str = str.toLowerCase(); // Convert to lowercase to simplify vowel/consonant check
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        
        // Displaying the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }
    
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

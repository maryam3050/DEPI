import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' ||
            character == 'i' || character == 'I' || character == 'o' || character == 'O' ||
            character == 'u' || character == 'U') {
            System.out.println(character + " is a vowel.");
        } else if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a valid alphabetic character.");
        }
        
        
        scanner.close();
    }
}
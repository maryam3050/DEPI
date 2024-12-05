import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 30) {
            System.out.println("You are age");
        }

        scanner.close();
    }
}
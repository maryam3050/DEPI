import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            if (angle1 + angle2 + angle3 == 180) {
                System.out.println("The angles form a valid triangle.");
            } else {
                System.out.println("The angles do not form a valid triangle.");
            }
        } else {
            System.out.println("The angles must be greater than 0.");
        }

        scanner.close();
    }
}
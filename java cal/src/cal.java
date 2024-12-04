import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        x = sc.nextInt();

        System.out.println("Enter y: ");
        y = sc.nextInt();

        // Use the correct operator for exponentiation (Math.pow)
        z = (int) (Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Hypotenuse squared is: " + z);

        // Close the Scanner
        sc.close();
    }
}

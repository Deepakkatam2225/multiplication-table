import java.util.Scanner;

public class Mutiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table using a for loop
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class UpperCaseToStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        UpperCaseToString upperCaseToString = new UpperCaseToString();
        String upperCaseString = upperCaseToString.convertToUpperCase(inputString);
        System.out.println("Uppercase string: " + upperCaseString);
        scanner.close();
    }
}

import java.util.Scanner;

public class CountCharInStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char searchChar = scanner.next().charAt(0);

        CountCharInString CCIS = new CountCharInString();

        int count = CCIS.CountCharInStringg(inputString, searchChar);

        System.out.println("Number of occurrences of '" + searchChar + "' in the string: " + count);

        scanner.close();
    }
}

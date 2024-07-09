import java.util.Scanner;

public class ContainsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringApp app = new StringApp();

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();

        boolean result = app.checkSubString(mainString, subString);
        if (result) {
            System.out.println("The string \"" + subString + "\" contains the mainstring");
        } else {
            System.out.println("The string \"" + subString + "\" does not contain the mainstring");
        }

        scanner.close();
    }
}
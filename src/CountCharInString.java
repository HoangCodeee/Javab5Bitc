public class CountCharInString {

    public int CountCharInStringg(String mainString, char searchChar) {
        int count = 0;

        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }
}

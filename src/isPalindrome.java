public class isPalindrome {
    public boolean checkPalindrome(String mainString) {
        String formattedString = mainString.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = formattedString.length() - 1;
        while (left < right) {
            if (formattedString.charAt(left) != formattedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        //bài này mềnh dùng chatgpt chứ chả biết làm//
    }
}

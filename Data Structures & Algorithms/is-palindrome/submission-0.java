class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            // Move the left pointer rightward if it points to a non-alphanumeric character
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // Move the right pointer leftward if it points to a non-alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters after converting them to lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}

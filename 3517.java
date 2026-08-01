import java.util.*

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int n = 

        StringBuilder left = new StringBuilder();
        char mid = '\0';

        if (n % 2 == 0) {
            left.append(s.substring(0, n / 2));
        } else {
            left.append(s.substring(0, n / 2));
            mid = s.charAt(n / 2);
        }

        char[] arr = left.toString().toCharArray();
        Arrays.sort(arr);

        StringBuilder ans = new StringBuilder();
        ans.append(arr);

        if (n % 2 != 0) {
            ans.append(mid);
        }

        
        for (int i = arr.length - 1; i >= 0; i--) {
            ans.append(arr[i]);
        }

        return ans.toString();
    }
}
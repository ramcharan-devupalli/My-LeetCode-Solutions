class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (arr[left] == ' ') {
            left++;
        }

        while (arr[right] == ' ') {
            right--;
        }

        StringBuilder sb = new StringBuilder();

        while (right >= left) {
            while (right >= left && arr[right] == ' ') {
                right--;
            }

            int end = right;

            while (right >= left && arr[right] != ' ') {
                right--;
            }

            for (int i = right + 1; i <= end; i++) {
                sb.append(arr[i]);
            }

            if (right >= left) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
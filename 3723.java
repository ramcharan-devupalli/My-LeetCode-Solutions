class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9)
        {
            return "";
        }
        int nines = sum / 9;
        int rem = sum % 9;
        int zeros = num - (nines + 1);
        StringBuilder sb = new StringBuilder();
        while(nines != 0)
        {
            sb.append('9');
            nines--;
        }
        sb.append(rem);
        while (zeros != 0) {
            sb.append('0');
        }

        return new String(sb);
    }
}
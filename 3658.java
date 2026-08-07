class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;
        int sumEven = n * (n + 1);

        while (sumOdd != 0)
        {
            int temp = sumOdd;
            sumOdd = sumEven % sumOdd;
            sumEven = temp;
        }
        return sumEven;
    }
}
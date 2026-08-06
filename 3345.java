import java.util.*;

class Solution {
    public int smallestNumber(int n, int t) {
        int product;
        do {
            product = 1;
            int N = n;
            int i;
            while(N != 0)
            {
                i = N % 10;
                product *= i;
                N /= 10;
            }
            n++;
        }while (product % t != 0);
        return n - 1;
    }
}
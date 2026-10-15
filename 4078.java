class Solution {
    public boolean threeFibonacciSum(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int temp = (fib1 + fib2) * 2;
        while(n != temp * 2)
        {
            if(temp > n)
            {
                return false;
            }
            temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        return true;
    }
}
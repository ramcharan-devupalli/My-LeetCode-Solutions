class Solution {
    public int reverseDegree(String s) {
        int reverse_degree = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            reverse_degree += (i * ('z' - c + 1));
        }
        return reverse_degree;
    }
}
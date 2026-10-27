class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            sb.append('.');
        }
        res[0] = sb.toString();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            if(i == n - 1)
            {
                s.append('.');
                break;
            }
            s.append('#');
        }
        for(int i = 1; i < m; i++)
        {
            res[i] = s.toString();
        }
        return res;
    }
}



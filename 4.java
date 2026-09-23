class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int a = 0, b = 0, i = 0;
        while(a < m && b < n)
        {
            if(nums1[a] < nums2[b])
            {
                arr[i++] = nums1[a++];
            }
            else
            {
                arr[i++] = nums2[b++];
            }
        }
        while(a < m)
        {
            arr[i++] = nums1[a++];
        }
        while (b < n)
        {
            arr[i++] = nums2[b++];    
        }
        int k = arr.length;
        if(k % 2 != 0)
        {
            return arr[k / 2]; 
        }
        return (arr[k / 2] + arr[k / 2 + 1]) / 2;
    }
}
import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
            }

            else if (nums1[i] > nums2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != nums2[j]) {
                    res.add(nums2[j]);
                }
                j++;
            }

            else {
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                res.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (res.isEmpty() || res.get(res.size() - 1) != nums2[j]) {
                res.add(nums2[j]);
            }
            j++;
        }

        int[] union = new int[res.size()];

        for (int k = 0; k < res.size(); k++) {
            union[k] = res.get(k);
        }

        return union;
    }
}
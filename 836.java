class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return overlap(rec1[0], rec1[2], rec2[0], rec2[2]) && overlap(rec1[1], rec1[3], rec2[1], rec2[3])
    }
    private boolean overlap(int start1, int end1, int start2, int end2)
    {
        return Math.min(end1, end2) - Math.max(start1, start2) > 0;
    }
}
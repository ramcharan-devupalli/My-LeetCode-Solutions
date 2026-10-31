class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int bob_a = Integer.parseInt(arriveBob.substring(3, 5));
        int alice_l = Integer.parseInt(leaveAlice.substring(3, 5));
        int bob_a_month = Integer.parseInt(arriveBob.substring(0, 2));
        int alice_l_month = Integer.parseInt(leaveAlice.substring(0, 2));
        if(bob_a_month == alice_l_month)
        {
            return bob_a - alice_l + 1;
        }
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return (days[bob_a_month - 1] - bob_a) + (alice_l - days[alice_l_month - 1]);
    }
}
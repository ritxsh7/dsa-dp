public class Robber2 {
    public int rob(int[] nums) {
        int prev1 = nums[0];
        int prev2 = 0;

        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i];
            if (i > 1)
                pick += prev2;
            int nonPick = prev1;

            int curr = Math.max(pick, nonPick);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        Robber2 r = new Robber2();
        int[] nums = { 2, 1, 1, 5 };
        System.out.println(r.rob(nums));
    }
}

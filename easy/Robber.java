public class Robber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int include;
            if (i > 1)
                include = nums[i] + dp[i - 2];
            else
                include = nums[i];

            int notInclude = dp[i - 1];
            dp[i] = Math.max(include, notInclude);
        }

        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Robber r = new Robber();
        int[] nums = { 2, 1, 1, 2 };
        System.out.println(r.rob(nums));
    }
}

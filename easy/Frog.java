public class Frog {
    public int minEnergy(int[] nums) {

        int prev1 = 0;
        int prev2 = 0;

        for (int i = 1; i < nums.length; i++) {
            int oneStep = prev1 + Math.abs(nums[i] - nums[i - 1]);
            int twoSteps = Integer.MAX_VALUE;
            if (i > 1) {
                twoSteps = prev2 + Math.abs(nums[i] - nums[i - 2]);
            }
            int curr = Math.min(oneStep, twoSteps);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        int[] nums = { 10, 20, 30, 10 };
        System.out.println(f.minEnergy(nums));
    }
}

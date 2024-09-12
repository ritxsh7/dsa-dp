import java.util.Arrays;

public class Training {
    public int solve(int[][] dp, int[][] tasks, int N, int last) {
        if (N == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, tasks[0][i]);
                }
            }
            return dp[N][last] = max;
        }

        if (dp[N][last] != -1)
            return dp[N][last];

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int points = tasks[N][i] + solve(dp, tasks, N - 1, i);
                max = Math.max(max, points);
            }
        }
        return dp[N][last] = max;
    }

    public int helper(int[][] tasks, int N) {
        int[][] dp = new int[N][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(dp, tasks, N, 3);
    }

    public static void main(String[] args) {
        Training t = new Training();
        int[][] tasks = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } };
        System.out.println(t.helper(tasks, 3));
    }
}

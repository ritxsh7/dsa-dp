public class Stairs {
    public int noOfWays(int n) {
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 2; i < n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        Stairs s = new Stairs();
        System.out.println(s.noOfWays(6));
    }
}

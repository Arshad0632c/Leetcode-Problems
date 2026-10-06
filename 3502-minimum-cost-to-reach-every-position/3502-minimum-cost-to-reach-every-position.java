class Solution {
    public int[] minCosts(int[] cost) {
        int n = cost.length;
        int res[] = new int[n];
        res[0] = cost[0];
        for (int i = 1; i < n; i++) {
            if (res[i - 1] > cost[i]) {
                res[i] = cost[i];
            } else {
                res[i] = res[i - 1];
            }
        }
        return res;
    }
}
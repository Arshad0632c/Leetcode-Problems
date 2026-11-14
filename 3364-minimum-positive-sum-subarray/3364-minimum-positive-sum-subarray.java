
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int result = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {

            int sum1 = 0;
            int ans1 = Integer.MAX_VALUE;

            for (int i = 0; i < k; i++) {
                sum1 += nums.get(i);
            }

            int currentsum1 = sum1;

            if (currentsum1 > 0) {
                ans1 = Math.min(ans1, currentsum1);
            }

            for (int i = k; i < nums.size(); i++) {

                currentsum1 += nums.get(i) - nums.get(i - k);

                if (currentsum1 > 0) {
                    ans1 = Math.min(ans1, currentsum1);
                }
            }

            result = Math.min(result, ans1);
        }

        if (result == Integer.MAX_VALUE) {
            return -1;
        }

        return result;
    }
}

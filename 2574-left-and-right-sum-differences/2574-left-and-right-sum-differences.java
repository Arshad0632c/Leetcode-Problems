class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int result[] = new int[n];
        leftSum[0] = 0;
        rightSum[n - 1] = 0;
        int leftsum = 0;
        for (int i = 1; i < n; i++) {
            leftsum += nums[i - 1];
            leftSum[i] = leftsum;
        }
        int rightsum = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightsum += nums[i + 1];
            rightSum[i] = rightsum;
        }
        for (int i = 0; i < leftSum.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}
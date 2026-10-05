class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int leftsum = 0;
            int rightsum = 0;
            int Difference = 0;
            for (int j = 0; j <= i; j++) {
                leftsum += nums[j];
            }
            for (int k = i + 1; k <= n - 1; k++) {
                rightsum += nums[k];
            }
            Difference = Math.abs(leftsum - rightsum);
            if (Difference % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}
class Solution {
    public int triangularSum(int[] nums) {

        while (nums.length >= 1) {
            int n = nums.length;
            int newNums[] = new int[n - 1];
            if (n == 1) {
                return nums[0];
            }
            for (int i = 0; i < nums.length - 1; i++) {
                newNums[i] = (nums[i] + nums[i + 1]) % 10;
            }

            nums = newNums;

        }
        return 0;
    }
}
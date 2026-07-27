class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int max;
        sort(nums.begin(),nums.end());
        int n=nums.size()-1;
        max=(nums[n]-1)*(nums[n-1]-1);
        return max;
    }
};
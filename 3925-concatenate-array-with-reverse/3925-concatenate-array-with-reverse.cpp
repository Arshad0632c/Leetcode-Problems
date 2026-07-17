class Solution {
public:
    vector<int> concatWithReverse(vector<int>& nums) {
        vector<int> res;
        int n=nums.size();
        for(int i=0;i<n;i++){
            res.push_back(nums[i]);
        }
        reverse(nums.begin(),nums.end());
        for(int j=0;j<nums.size();j++){
            res.push_back(nums[j]);
        }
        return res;
    }
};
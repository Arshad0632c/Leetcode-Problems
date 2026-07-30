class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> res;
        vector<int> ans;
        vector<int> sol;
        k=k%nums.size();
        for(int i=nums.size()-1;i>=nums.size()-k;i--){
            res.push_back(nums[i]);
        }
        for(int j=0;j<nums.size()-k;j++){
            ans.push_back(nums[j]);
        }
        reverse(res.begin(),res.end());
        for(int k=0;k<res.size();k++){
            sol.push_back(res[k]);
        }
        for(int n=0;n<ans.size();n++){
            sol.push_back(ans[n]);
        }
        nums=sol;

    }
};
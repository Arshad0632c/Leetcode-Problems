class Solution {
public:
    int subarraySum(vector<int>& nums) {
        vector<int> res;
        int totalsum=0;
       for(int i=0;i<nums.size();i++){
         int start=max(0,i-nums[i]);
         int sum=0;
         for(int j=start;j<=i;j++){
            sum=sum+nums[j];
         }
         res.push_back(sum);

       }
       for(int k=0;k<res.size();k++){
        totalsum=totalsum+res[k];
       }
       return totalsum; 
    }
};
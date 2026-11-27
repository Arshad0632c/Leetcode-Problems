class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        map<int, int> mp;
        int count = 0;
        int Max = 0;
        for (int i = 0; i < nums.size(); i++) {
            mp[nums[i]]++;
            Max = max(Max, mp[nums[i]]);
        }
        for (auto x : mp) {
            if (x.second == Max) {
                count++;
            }
        }
        return count * Max;
    }
};
class Solution {
public:
    int findLucky(vector<int>& arr) {
        map<int, int> mp;
        int ans = -1;
        for (int i = 0; i < arr.size(); i++) {
            mp[arr[i]]++;
        }
        for (auto x : mp) {
            if (x.first == x.second) {
                ans = max(ans, x.first);
            }
        }
        return ans;
    }
};
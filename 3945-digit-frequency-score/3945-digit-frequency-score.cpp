class Solution {
public:
    int digitFrequencyScore(int n) {
        vector<int> res;
        map<int, int> mp;
        int sum = 0;
        while (n != 0) {
            res.push_back(n % 10);
            n /= 10;
        }
        for (int i = 0; i < res.size(); i++) {
            mp[res[i]]++;
        }
        for (auto x : mp) {
            sum += (x.first * x.second);
        }
        return sum;
    }
};
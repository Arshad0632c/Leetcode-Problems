class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        unordered_set<int> s(nums1.begin(),nums1.end());
        unordered_set<int> a(nums2.begin(),nums2.end());
        vector<int> arr;
        vector<int> arrs;
        for(auto x:s){
          arr.push_back(x);
        }
        for(auto y:a){
          arrs.push_back(y);
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arrs.size();j++){
                if(arr[i]==arrs[j]){
                    res.push_back(arr[i]);
                }
            }
        }
        return res;
    }
};
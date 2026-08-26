class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> left, right, equal, res;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] < pivot) {
                left.push_back(nums[i]);
            } else if (nums[i] == pivot) {
                equal.push_back(nums[i]);
            } else {
                right.push_back(nums[i]);
            }
        }
        for (int i = 0; i < left.size(); i++) {
            res.push_back(left[i]);
        }
        for (int i = 0; i < equal.size(); i++) {
            res.push_back(equal[i]);
        }
        for (int i = 0; i < right.size(); i++) {
            res.push_back(right[i]);
        }
        return res;
    }
};
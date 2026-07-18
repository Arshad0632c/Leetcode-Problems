class Solution {
public:
    bool checkGoodInteger(int n) {
        vector<int> res;
        int digitsum=0;
        int squaresum=0;
        while(n!=0){
            res.push_back(n%10);
            n=n/10;
        }
        for(int i=0;i<res.size();i++){
            digitsum+=res[i];
            squaresum+=(res[i]*res[i]);
        }
        return (squaresum-digitsum)>=50;
    }
};
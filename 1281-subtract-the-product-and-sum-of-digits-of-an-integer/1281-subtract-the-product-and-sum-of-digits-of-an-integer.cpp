class Solution {
public:
    int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int num=n;
        while(num!=0){
            product*=num%10;
            sum+=num%10;
            num=num/10;
        }
        return product-sum;
    }
};
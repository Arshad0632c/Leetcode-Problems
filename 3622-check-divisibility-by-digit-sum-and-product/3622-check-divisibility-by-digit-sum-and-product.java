class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 , product = 1 , temp = n , total = 0;

        while(n!=0){
            sum += n%10;
            product *= n%10;
            n /= 10;
        }
        if(temp % (sum + product) == 0){
            return true;
        }
        return false;
    }
}
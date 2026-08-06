class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int n=numOnes+numZeros+numNegOnes;
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<numOnes;i++){
            arr[i]=1;
        }
        for(int i=numOnes;i<numOnes+numZeros;i++){
            arr[i]=0;
        }
        for(int i=numOnes+numZeros;i<n;i++){
            arr[i]=-1;
        }
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int n=numOnes+numZeros+numNegOnes;
        int sum=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<numOnes;i++){
            arr.add(1);
        }
        for(int i=numOnes;i<numOnes+numZeros;i++){
            arr.add(0);
        }
        for(int i=numOnes+numZeros;i<n;i++){
            arr.add(-1);
        }
        for(int i=0;i<k;i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}
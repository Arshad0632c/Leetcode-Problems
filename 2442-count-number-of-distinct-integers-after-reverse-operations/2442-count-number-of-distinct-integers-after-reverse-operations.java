class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> Arr = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n ; i++){
            int num = nums[i];
            int reverse = 0;
            while(num != 0){
                reverse = reverse * 10 + (num%10);
                num/=10;
            }
            arr.add(reverse);
        }
        for(int i=0 ; i<n ; i++){
            Arr.add(nums[i]);
        }
        for(int i=0 ; i<arr.size() ; i++){
            Arr.add(arr.get(i));
        }
        for(int x: Arr){
            s.add(x);
        }

    return s.size();
        
    }
}
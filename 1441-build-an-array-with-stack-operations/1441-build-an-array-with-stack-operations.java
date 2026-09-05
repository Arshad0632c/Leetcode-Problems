class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        for(int j = 1; j <= n; j++){
            if(target[i] == j){
                result.add("Push");
                i++;
                if(i == target.length){
                    break;
                }
            }
            else{
                result.add("Push");
                result.add("Pop");
            }
    }
    return result;
    }
}
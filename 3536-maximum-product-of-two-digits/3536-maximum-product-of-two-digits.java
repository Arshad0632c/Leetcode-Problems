class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int mul = 0;
        int Max = 0;
        while (n != 0) {
            int digit = n % 10;
            res.add(digit);
            n = n / 10;
        }
        for (int i = 0; i < res.size(); i++) {
            for (int j = i + 1; j < res.size(); j++) {
                mul = res.get(i) * res.get(j);
                Max = Math.max(Max, mul);
            }
        }
        return Max;
    }
}
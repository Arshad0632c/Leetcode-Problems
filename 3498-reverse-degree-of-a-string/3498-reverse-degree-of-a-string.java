class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int j = 1;
        int digit = 0;
        for (int i = 0; i < s.length(); i++) {
            digit = Math.abs(s.charAt(i) - 'z') + 1;
            sum += (j * digit);
            j++;
        }
        return sum;
    }
}
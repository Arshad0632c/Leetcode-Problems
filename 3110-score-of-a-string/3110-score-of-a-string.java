class Solution {
    public int scoreOfString(String s) {
        int arr[] = new int[s.length()];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            arr[i] = ascii;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            sum = sum + Math.abs(arr[i] - arr[i + 1]);
            ans += sum;
        }
        return ans;
    }
}
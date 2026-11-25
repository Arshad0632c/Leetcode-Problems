class Solution {
    public boolean halvesAreAlike(String s) {
        String S = s.toLowerCase();
        int n = S.length();
        int count1 = 0;
        int count2 = 0;
        String a = "";
        String b = "";
        for (int i = 0; i < n / 2; i++) {
            a = a + S.charAt(i);
        }
        for (int i = n / 2; i < n; i++) {
            b = b + S.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == 'a') || (a.charAt(i) == 'e') || (a.charAt(i) == 'i') || (a.charAt(i) == 'o')
                    || (a.charAt(i) == 'u')) {
                count1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if ((b.charAt(i) == 'a') || (b.charAt(i) == 'e') || (b.charAt(i) == 'i') || (b.charAt(i) == 'o')
                    || (b.charAt(i) == 'u')) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int Max = 0;
        String res = "";
        for (int i = 0; i < sentences.length; i++) {
            res = sentences[i];
            String ans[] = res.split(" ");
            Max = Math.max(Max, ans.length);

        }
        return Max;
    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        int count = 0;
        HashSet<Character> b = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++){
            b.add(brokenLetters.charAt(i));
        }
        for(int i = 0; i < s.length; i++){
            String word = s[i];
            boolean f = true;
            for(int j = 0 ; j < word.length(); j++){
                if(b.contains(word.charAt(j))){
                    f = false;
                    break;
                }
            }
            if(f)
                count++;
        }
        
         return count;
    }
}
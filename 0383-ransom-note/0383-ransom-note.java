class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character , Integer> ransom = new HashMap<>();
        Map<Character , Integer> maga = new HashMap<>();

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            ransom.put( c , ransom.getOrDefault(c , 0) + 1 );
        }
        for(int i = 0 ; i < magazine.length() ; i++){
            char c = magazine.charAt(i);
            maga.put( c ,maga.getOrDefault(c , 0) + 1 );
        }
        

        for(char key : ransom.keySet()){

            if( !maga.containsKey(key) || ransom.get(key) > maga.get(key)){
                return false;
            }
        }
        
        return true;
    }
}
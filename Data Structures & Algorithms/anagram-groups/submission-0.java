class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> wordList = new HashMap<>();
        for (String word : strs){
            int[] count = new int[26];
            for ( char s : word.toCharArray()){
                //calculating char freq
                count[s-'a']++;
            }
            StringBuilder bkey = new StringBuilder();
            for( int num :count){
            bkey.append(num).append('#');
            }
            String freqkey = bkey.toString();
            wordList.putIfAbsent(freqkey,new ArrayList<>());
            wordList.get(freqkey).add(word);
            
        }
        return new ArrayList<>(wordList.values());
    }
}

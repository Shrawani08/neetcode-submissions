class Solution {
    public int longestConsecutive(int[] nums) {
        int count  = 0; //for empty array
       HashMap<Integer,Boolean> values = new HashMap<>();
       for (int n : nums){
        values.put(n,Boolean.FALSE);
       }
       for (int n:nums){
        int current=1;
        int next = n+1;
        while(values.containsKey(next) && values.get(next)==false){
            current++;
            values.put(next,Boolean.TRUE);
            next++;
        }
        int prev = n-1;
        while(values.containsKey(prev) && values.get(prev)==false){
            current++;
            values.put(prev,Boolean.TRUE);
            prev--;
            
        }
        count = Math.max(count,current);
       }
       return count;
    }
}

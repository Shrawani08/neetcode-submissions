class Solution {
    public int longestConsecutive(int[] nums) {
        int count  = 0; //for empty array
       HashSet<Integer> values = new HashSet<>();
       for (int num : nums) {
            values.add(num);
        }
        for(int x :nums){
            if(!values.contains(x-1)){
                int currentnum = x;
                int currentlen= 1;
                while(values.contains(currentnum+1)){
                    currentnum++;
                    currentlen++;

                }
                count = Math.max(count,currentlen);
            }
        }
       return count;
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dups = new HashSet<>();
        for (int num:nums){
            if(dups.contains(num)){
                return true;
            }
            else{
                dups.add(num);
            }
        }
        return false;
    }
}
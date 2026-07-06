class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftvalues = new int[nums.length];
        int[] rightvalues = new int[nums.length];
        int[] result = new int[nums.length];
        //iterate left to right from 2nd elem
        leftvalues[0]=1;
        for(int i=1;i<nums.length;i++){
            leftvalues[i]= leftvalues[i-1]*nums[i-1];
        }
        rightvalues[nums.length-1]=1;
        //iterate right to left from 2nd last elem
        for(int i=nums.length-2;i>=0;i--){
            rightvalues[i]= rightvalues[i+1]*nums[i+1];
        }
       for(int i=0;i<result.length;i++){
           result[i] = leftvalues[i]*rightvalues[i];
        }
        return result;
    }

}  

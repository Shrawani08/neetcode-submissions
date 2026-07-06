class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int elem:nums){
            freqmap.put(elem,freqmap.getOrDefault(elem,0)+1);
            //getordefault provides a value of specified key or provides a fallback value as specified ie.0 if key not available
        }
        List<Integer>[] buckets = new List[nums.length+1];
        //we use one extra as number freq can be 0(unused),1,2...upto nums.length
        //keyset returns a Set view of all the keys contained within a map.
        for (int num : freqmap.keySet()) {
            int freq = freqmap.get(num);
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
                //note : reason to do this A list is created only when it's needed.
// Existing lists aren't overwritten.
// All numbers with the same frequency are grouped together in the same bucket.
            }
            buckets[freq].add(num); 
        }
        //gather result
        int[] result = new int[k];
        int counter = 0;
        //backwards loop
        for (int freqptr = buckets.length - 1; freqptr >= 0; freqptr--) {
            //if bucket does not hold any value, skip it..
            if (buckets[freqptr] != null) {
                //visit every elem in arraylist ↓ 
                for (int num : buckets[freqptr]) {
                    //increase index and insert that number in result array
                    result[counter++] = num;
                    // Once we have collected K elements, we are done
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        //for empty arr condition 
        return result;
    }
}



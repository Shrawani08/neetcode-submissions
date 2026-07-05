class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int elem:nums){
            freqmap.put(elem,freqmap.getOrDefault(elem,0)+1);
            //getordefault provides a value of specified key or provides a fallback value as specified ie.0 if key not available
        }
        List<Integer>[] buckets = new List[nums.length+1];
        //keyset returns a Set view of all the keys contained within a map.
        for (int num : freqmap.keySet()) {
            int freq = freqmap.get(num);
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }
        //gather result
        int[] result = new int[k];
        int res_index = 0;
        for (int freqptr = buckets.length - 1; freqptr >= 0; freqptr--) {
            if (buckets[freqptr] != null) {
                for (int num : buckets[freqptr]) {
                    result[res_index++] = num;
                    // Once we have collected K elements, we are done
                    if (res_index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}



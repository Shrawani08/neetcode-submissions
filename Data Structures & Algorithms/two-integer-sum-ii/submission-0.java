class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
        int currentSum = numbers[left] + numbers[right];
        if (currentSum == target) {
                // Found the match! Convert 0-indexed to 1-indexed.
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                // Sum is too small, move left pointer rightward to get a larger value
                left++;
            } else {
                // Sum is too large, move right pointer leftward to get a smaller value
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}

import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = Arrays.stream(nums)
                .filter(x -> x != 0)
                .toArray();
        System.arraycopy(result, 0, nums, 0, result.length);
        Arrays.fill(nums, result.length, nums.length, 0);
    }
}
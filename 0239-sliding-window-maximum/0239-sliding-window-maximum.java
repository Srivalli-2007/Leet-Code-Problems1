import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        result[0] = map.lastKey();
        for (int i = k; i < n; i++) {
            int old = nums[i - k];
            map.put(old, map.get(old) - 1);
            if (map.get(old) == 0) {
                map.remove(old);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            result[i - k + 1] = map.lastKey();
        }
        return result;
    }
}
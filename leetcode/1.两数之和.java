import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);

        }
        for (int i = 0; i < len; i++) {
            int another = target - nums[i];
            if (map.containsKey(another) && map.get(another) != i) {
                return new int[] { i, map.get(another) };
            }
        }
        return null;

    }
}
// @lc code=end
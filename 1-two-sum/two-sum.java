import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (hmap.containsKey(required)) {
                return new int[]{hmap.get(required), i};
            }

            hmap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] count = new long[k];
        for (int num : nums) {
            int x = num % k;
            long[] current = new long[k];
            current[x]++;
            for (int r = 0; r < k; r++) {
                if (count[r] > 0) {
                    int newRem = (r * x) % k;
                   current[newRem] += count[r];
                }
            }
            for (int r = 0; r < k; r++) {
                ans[r] += current[r];
            }

            count = current;
        }
        return ans;
    }
}
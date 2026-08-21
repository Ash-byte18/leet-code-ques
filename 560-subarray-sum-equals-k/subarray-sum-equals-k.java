class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> Map = new HashMap<>();
        Map.put(0,1);
        int sum =0;
        int count = 0;

        for(int num : nums){
            sum+=num;

            if(Map.containsKey(sum-k)){
            count+=Map.get(sum-k);
            }
            Map.put(sum,Map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
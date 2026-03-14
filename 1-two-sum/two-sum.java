class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        int val1=0;
        int val2=0;
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                val1=map.get(complement);
                val2=i;
                break;
            }
            map.put(nums[i],i);
        }
        int[] arr={val1, val2};
        return arr;
    }
}
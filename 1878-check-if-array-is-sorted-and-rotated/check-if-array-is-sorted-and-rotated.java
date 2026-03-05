class Solution {
    public boolean check(int[] nums) {
        int count=0;
        boolean res=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                count++;
                if(count==2){
                    res=false;
                }
            }
        }
        if(count==1 && nums[nums.length-1]>nums[0]){
            res=false;
        }
        return res;
    }
}
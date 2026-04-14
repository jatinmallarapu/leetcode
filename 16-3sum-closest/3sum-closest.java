class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=0;
        int sum=0;
        int closest=100000;
        for(int k=0;k<=nums.length-3;k++){
            i=k+1;
            j=nums.length-1;
            while(i<j){
                sum=nums[k]+nums[i]+nums[j];
                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest=sum;
                    
                }
                if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return closest;
    }
}
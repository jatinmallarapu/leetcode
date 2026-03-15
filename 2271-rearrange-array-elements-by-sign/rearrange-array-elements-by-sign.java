class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ao=new int[nums.length/2];
        int[] ae=new int[nums.length/2];
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ae[j]=nums[i];
                j++;
            }
            else{
                ao[k]=nums[i];
                k++;
            }
        }
        int h=0;int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0 || i==0){
                nums[i]=ae[h];
                h++;
            }else{
                nums[i]=ao[m];
                m++;
            }
        }
        return nums;
    }
}
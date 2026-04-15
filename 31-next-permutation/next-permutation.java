class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
        //System.out.println(index);
        int target=nums[index];
        int swapIndex=index;
        for(int i=nums.length-1;i>=index+1;i--){
            if(nums[i]>target){
                swapIndex=i;
                break;
            }
        }
        swap(nums, index, swapIndex);
        reverse(nums, index+1, nums.length-1);
        
        }
        else{
            reverse(nums, 0, nums.length-1);
        }
        
        //System.out.println(Arrays.toString(nums));
    }
    
    void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }

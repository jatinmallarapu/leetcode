class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
         for (int num : nums) {
            if (num == 0) cnt0++;
            else if (num == 1) cnt1++;
            else cnt2++;
        }

        // Second pass: Fill the array with 0s, then 1s, then 2s

        // Fill the first 'cnt0' elements with 0
        for (int i = 0; i < cnt0; i++) {
            nums[i] = 0;
        }

        // Fill the next 'cnt1' elements with 1
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[i] = 1;
        }

        // Fill the remaining elements with 2
        for (int i = cnt0 + cnt1; i < nums.length; i++) {
            nums[i] = 2;
        }
        }
    }

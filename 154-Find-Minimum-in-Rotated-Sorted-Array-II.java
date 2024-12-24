class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]<min){
                min=nums[mid];
            }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high--;
            }
            
        }
        return min;
    }
}
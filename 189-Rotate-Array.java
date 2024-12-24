class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int rp=n-k;
        rare(nums,rp,n-1);
        rare(nums,0,rp-1);
        rare(nums,0,n-1);
    }
    public static void rare(int arr[],int st,int end){
        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
    }
        public static void swap(int arr[],int st,int end){
            int t=arr[st];
            arr[st]=arr[end];
            arr[end]=t;
    }
}
class Solution {
    public int removeDuplicates(int[] arr) {
        int i,j=1;
        for(i=1;i<arr.length;i++){
                if(arr[i]!=arr[i-1]){
                    arr[j]=arr[i];
                    j++;
                }
            
        }
        return j;
    }
}
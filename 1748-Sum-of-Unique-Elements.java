class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:nums){
            if(hash.containsKey(i)){
                hash.put(i,hash.get(i)+1);
            }else{
                hash.put(i,1);
            }
        }
        int sum=0;
        for(int j:nums){
            if(hash.get(j)==1){
            sum+=j;
            }
        }
        return sum;
        
        
    }
}
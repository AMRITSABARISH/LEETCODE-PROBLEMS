class Solution {
    public int scoreOfString(String s) {
        char arr[] =s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
             sum+=Math.abs((int)arr[i]-(int)arr[i+1]);



            }
            return sum;
        }
        
    }

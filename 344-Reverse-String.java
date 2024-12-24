class Solution {
    public void reverseString(char[] s) {
        int st=0,end=s.length-1;
        while(st<end){
            char t = s[st];
            s[st]=s[end];
            s[end]=t;
            st++;
            end--;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        
    }
}
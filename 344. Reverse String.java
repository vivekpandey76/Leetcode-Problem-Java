class Solution {
    public void reverseString(char[] s) {
      int size=s.length,n=size-1;
      char temp;
       
      for(int i=0;i<size/2;i++){
         temp=s[i];
         s[i]=s[n];
         s[n]=temp;
         n--;
      }
        
    }
}

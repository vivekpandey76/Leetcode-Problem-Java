class Solution {
    public char findTheDifference(String s, String t) {
      //Convert the string in character array
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
      //Sort them 
        Arrays.sort(s1);
        Arrays.sort(t1);
        int size=s.length();
      //After sorting check whether each character of first string is same or not as character of second string
        for(int i=0;i<size;i++){
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[size];
    }
}

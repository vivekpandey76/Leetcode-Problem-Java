class Solution {
    public boolean isPalindrome(int x) {
        //If value is negative simply return that it's not palindrome
        if(x<0){
            return false;
        }
        //Store the value of x so that we can reverse temp variable and at the end we can check reverse with our original number
        int temp=x;
        int reverse=0;
        int unitplace;
        while(temp>0){
            unitplace=temp%10;
            reverse=(reverse*10)+unitplace;
            temp=temp/10;  
        }
        if(reverse==x){
            return true;
        }else{
            return false;
        }
        
    }
}
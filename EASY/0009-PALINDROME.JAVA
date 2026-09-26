class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int num=x, remainder, palin = 0;
        while(x!=0)
        {
            remainder=x%10;
            palin=palin*10+remainder;
            x/=10;
        }
        if(palin==num)
        return true;
  
        return false;
        }
}
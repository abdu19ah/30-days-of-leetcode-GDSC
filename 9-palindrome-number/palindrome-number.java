class Solution {
    public boolean isPalindrome(int x) {
        int num = x, rem, half = 0;
         
        while(x > 0) {
            rem = x % 10;
            half = (half*10) + rem;
            x = x / 10; 
        }
        if(half == num)
            return true;
        else 
            return false;
    }
}
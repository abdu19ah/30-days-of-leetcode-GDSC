/*Since we have to solve the problem in 0(n) and only constant space therefore we cant use the brute method instead we will use XOR mathematical function to solve the problem*/

class Solution {
    public int singleNumber(int[] nums) {
        
        int single_num = nums[0];
        for(int i = 1 ; i < nums.length ; i++) 
            single_num = single_num ^ nums[i];
        
        return single_num;
        
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] prefixProd = new int[n];
        prefixProd[0] = 1;
        
        for(int i = 1 ; i < n ; i++) {
            prefixProd[i] = prefixProd[i-1] * nums[i-1];
        }
        
        int temp = 1;
        
        for(int i = n-1 ; i >=0 ; i--) {
            prefixProd[i] = prefixProd[i] * temp;
            temp = temp * nums[i];
        }
    
        return prefixProd;
    }
}
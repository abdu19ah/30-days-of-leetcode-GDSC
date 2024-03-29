class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int itr = nums1.length - 1;
        m--; n--;
        
        while(m >= 0 && n >= 0) {
            if(nums1[m] > nums2[n])
                nums1[itr--] = nums1[m--];
            else
                nums1[itr--] = nums2[n--];
        }
        for( ; n >= 0 ; ) 
            nums1[itr--] = nums2[n--];
         
    }
}
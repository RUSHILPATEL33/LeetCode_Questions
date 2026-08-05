class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) 
            return findMedianSortedArrays(nums2, nums1); 
        int n1 = nums1.length;
        int n2 = nums2.length;
        int lo=0;
        int hi = n1;
        int totalLeft = (n1 + n2 + 1) / 2; // elements needed on left side
        while(lo<=hi){
            int ct1= lo+(hi-lo)/2;
            int ct2= totalLeft-ct1;
            int L1, R1, L2, R2;
            if(ct1==0){
                L1=Integer.MIN_VALUE; // no elements from nums1 on the left
            }else{
                L1=nums1[ct1-1];
            }
            if(ct1==n1){
                 R1 = Integer.MAX_VALUE;   // all of nums1 is on the left, nothing left for the right
            }else{
                R1=nums1[ct1];
            }
            // L2 = last element on the left side of nums2
            if (ct2 == 0) {
                L2 = Integer.MIN_VALUE;
            } else {
                L2 = nums2[ct2 - 1];
            }
            // R2 = first element on the right side of nums2
            if (ct2 == n2) {
                R2 = Integer.MAX_VALUE;
            } else {
                R2 = nums2[ct2];
            }
            if(L1<=R2 && L2<=R1){
                if((n1+n2)%2==0){
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                }else{
                    return Math.max(L1, L2);
                }
        } else if (L1 > R2) {
            hi = ct1 - 1;  
        } else {
            lo = ct1 + 1;  
        }
    
    }
    return -1;
}
}
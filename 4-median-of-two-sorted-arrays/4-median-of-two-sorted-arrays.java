class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;//2+1=3
        int[] arr = new int[n];
        for(int i=0; i<nums1.length; i++){//i=0,1,2
           arr[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            arr[nums1.length+i] = nums2[i];
        }
        Arrays.sort(arr);
        
        int start=0, end=n-1;
        int mid = start+(end-start)/2;
        double ans;
        if(n%2==0){
            double sum = arr[mid]+arr[mid+1]; //2+3=5 5/2=2.5
            ans = sum/2;
        }
        else{
            ans = arr[mid];
        }
        return ans;
    }
}
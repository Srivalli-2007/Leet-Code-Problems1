class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int n = nums.length;
        while (l<= h) {
            if (nums[l] <= nums[h]) {
                return nums[l];
            }
            int mid = l+(h-l)/2;
            int next =(mid+1)%n;
            int prev = (mid-1+n)%n;
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return nums[mid];
            }
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return 0;  
    }
}
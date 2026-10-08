class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans;
		int s=0;
        double avg=0;
		for(int i=0;i<k;i++){
			s=s+nums[i];
            avg=(double)s/k;
        }
		ans=avg;
		for(int i=1;i<=n-k;i++)
		{
			s=s-nums[i-1];
			s=s+nums[i+k-1];
            avg=(double)s/k;
			if(avg>ans)
				ans=avg;
		}
		return ans; 
    }
}
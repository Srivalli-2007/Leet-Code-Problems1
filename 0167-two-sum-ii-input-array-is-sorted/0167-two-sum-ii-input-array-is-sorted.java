class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int s=numbers[left]+numbers[right];
            if(s<target){
                left++;
            }
            else if(s>target){
                right--;
            }
            else{
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
}
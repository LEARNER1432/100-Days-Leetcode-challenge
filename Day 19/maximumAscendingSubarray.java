class maximumAscendingSubarray {
    public int maxAscendingSum(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum=sum+nums[i];
                if(sum>max){
                    max=sum;
                }
            }
            else{
                sum=nums[i];
            }
        }
        return max;
        
    }
}
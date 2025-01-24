class Solution {
    public int dominantIndex(int[] nums) {
        int largest=-1;
        int seclarge=-1;
        int maxIdx=0;
        for(int  i=0;i<nums.length;i++){
            if(largest<nums[i]){
                seclarge=largest;
                largest=nums[i];
                
                maxIdx=i;
                

            }else if ( seclarge < nums[i]){
                seclarge = nums[i];
            
            }
        }
        if(seclarge*2<=largest){
                return maxIdx;
        
        
    }else{
        return -1;
    }
}
}
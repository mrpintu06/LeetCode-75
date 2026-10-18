class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int sum = 0;
    
      for (int i = 0; i< k; i++){
        sum += nums[i];

      }  
      int  maxsum = sum;
      
         // window ko aage khiskao
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];   // naya jodo, purana hatao
            maxsum = Math.max(maxsum, sum);
    }
    return (double) maxsum / k;
}
}
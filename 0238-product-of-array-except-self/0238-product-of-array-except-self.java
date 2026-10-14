class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] ans = new int[n];


      int a = 1;
      for(int i = 0; i<n ;i++){
        ans[i] = a;
        a *= nums[i];

      }
       int b = 1;
   
        for (int i = n - 1; i >= 0; i--){
            ans[i] *= b;
            b *= nums[i];
        }
        return ans;
    }
}
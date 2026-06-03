// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//          int maxCount = 0;
//         int ans = 0;
//         int  n = nums.length;
//         for(int i=0;i< nums.length;i++){
//              if(nums[i] == 1) {
//                  ans++;
//                  maxCount = Math.max(maxCount,ans);
//              } else {
//                  ans = 0;
//              }
//         }
//         return maxCount;
//     }
// }


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num: nums){
            if (num == 1){
                count++;
                max = Math.max(max,count);
            }else {
                count = 0;
            }
        }
        return max;
    }
}
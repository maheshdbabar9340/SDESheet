// import java.util.Arrays;
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int[] ans = new int[nums.length];
//         int j =0;
//         if(nums.length > 1){
//             for(int i=0; i<nums.length-1; i++) {
//                     if(nums[i]!=nums[i+1]) {
//                         ans[j++] = nums[i];
//                     }else{
//                         i++;
//                     }
//                 }
//         }
//         return ans.length;
//     }
// }


// Given nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

// It doesn't matter what you leave beyond the returned length.

// Intuition behind solution: Have an variable to keep track of where to place the next unique number. Start this variable at 1 because the first element in the array is always unique. Iterate through the rest of the array placing all other unique numbers at the nums[index] increment ing index after placing the number so that the next time you find a unique number you place it in the next spot. Once you loop terminates, return index which represents the number of unique values in the array and therefore the new length.
    
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}

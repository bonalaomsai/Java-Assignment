/*An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
Given an integer array nums, return the number of arithmetic subarrays of nums.
A subarray is a contiguous subsequence of the array.*/
public class ArithmeticSubarrays {
    public int numberOfArithmeticSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int diff = nums[i + 1] - nums[i];
            for (int j = i + 2; j < n; j++) {
                if (nums[j] - nums[j - 1] == diff) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArithmeticSubarrays solution = new ArithmeticSubarrays();

        int[] nums = {1, 2, 3, 4};
        System.out.println(solution.numberOfArithmeticSubarrays(nums)); // Output: 3

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(solution.numberOfArithmeticSubarrays(nums2)); // Output: 6
    }
}

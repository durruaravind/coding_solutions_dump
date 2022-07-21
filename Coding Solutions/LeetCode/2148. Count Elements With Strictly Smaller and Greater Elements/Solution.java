import java.util.Scanner;

/*
 * 2148. Count Elements With Strictly Smaller and Greater Elements
User Accepted:8617
User Tried:9189
Total Accepted:8864
Total Submissions:15243
Difficulty:Easy
Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

 

Example 1:

Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
Example 2:

Input: nums = [-3,3,3,90]
Output: 2
Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.
 

Constraints:

1 <= nums.length <= 100
-105 <= nums[i] <= 105
 */

class Solution {

    public static void main(String[] args) {
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();
        System.out.println(ob.countElements(nums));
        sc.close();
    }

    public int countElements(int[] nums) {
        int l = nums.length;
        int k = 0;
        for (int i = 0; i < l; i++) {
            boolean left = false;
            boolean right = false;
            for (int j = 0; j < l; j++) {
                if (nums[j] > nums[i] && j != i)
                    right = true;
            }
            for (int j = 0; j < l; j++) {
                if (nums[j] < nums[i] && j != i)
                    left = true;
            }
            if (right == true && left == true)
                k++;
        }
        return (k);
    }
}
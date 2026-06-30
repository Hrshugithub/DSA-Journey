//# Second Largest Element in an Array
//
//## Problem Statement
//Given an integer array `nums`, return the second largest distinct element present in the array. If the second largest element does not exist, return `-1`.
//
//        ### Example
//
//Input:
//nums = [12, 35, 1, 10, 34, 1]
//
//Output:34
//
//Explanation:
//The largest element in the array is 35, and the second largest distinct element is 34.
//
//        ## Approach
//1. Sort the array in ascending order using the Bubble Sort algorithm.
//2. Start traversing the array from the second last element.
//3. Compare each element with the largest element (last element of the sorted array).
//4. Return the first element that is smaller than the largest element.
//5. If no such element exists, return `-1`.
//
//        ## Algorithm
//1. Sort the array using Bubble Sort.
//2. Store the largest element as the last element of the sorted array.
//3. Traverse the array from right to left, starting from the second last index.
//4. If an element is different from the largest element, return it.
//5. If no distinct second largest element is found, return `-1`.
//
//        ## Time Complexity
//O(n²)
//
//## Space Complexity
//O(1)
//
//## Java Code
//This solution uses the Bubble Sort algorithm to sort the array and then finds the second largest distinct element by traversing the sorted array from right to left.
//
//        ## Tags
//#Java #DSA #Arrays #BubbleSort
package Arrays;

public class SecondLargestElement {

    public int secondLargestElement(int[] nums) {

        sort(nums);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[nums.length - 1]) {
                return nums[i];
            }
        }

        return -1;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {12, 35, 1, 10, 34, 1};

        SecondLargestElement obj = new SecondLargestElement();

        int ans = obj.secondLargestElement(nums);

        System.out.println("Second Largest Element: " + ans);
    }
}
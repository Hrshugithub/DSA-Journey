//# Largest Element in an Array
//
//## Problem Statement
//Given an integer array `nums`, find and return the largest element present in the array.
//
//### Example
//
//Input:
//nums = [3, 2, 1, 5, 6, 4]
//
//Output:6
//
//
//## Approach
//1. Sort the array using the Bubble Sort algorithm.
//2. After sorting, the largest element will be present at the last index of the array.
//3. Return the element at the last index of the sorted array.
//
//## Algorithm
//1. Traverse the array multiple times.
//2. Compare adjacent elements.
//3. Swap them if they are in the wrong order.
//        4. Continue the process until the array becomes sorted in ascending order.
//5. Return the last element of the array.
//
//## Time Complexity
//O(n²)
//
//## Space Complexity
//O(1)
//
//## Java Code
//This solution uses the Bubble Sort algorithm to sort the array in ascending order and then returns the last element as the largest element in the array.
//
//## Tags
//#Java #DSA #Arrays #BubbleSort
package Arrays;

public class LargestElement {

    public int largest(int[] nums) {
        sort(nums);
        return nums[nums.length - 1];
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
        int[] nums = {3, 2, 1, 5, 6, 4};

        LargestElement obj = new LargestElement();
        System.out.println(obj.largest(nums));
    }
}
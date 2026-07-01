//## Problem Statement
//
//Given an `ArrayList<Integer>`, determine whether the elements are sorted in non-decreasing (ascending) order.
//
//Return:
//- `true` if the ArrayList is sorted.
//- `false` otherwise.
//
//### Example 1
//
//Input:
//```java
//[1, 2, 3, 4, 5]


import java.util.ArrayList;

public class IsSorted {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        IsSorted obj = new IsSorted();

        boolean result = obj.isSorted(nums);

        System.out.println("Is the ArrayList sorted? " + result);
    }

    public boolean isSorted(ArrayList<Integer> nums) {
        return check(nums);
    }

    boolean check(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
//# Check if a Number is a Power of 2
//
//        ## Problem Statement
//
//Given a positive integer `n`, determine whether it is a power of 2 using bit manipulation.
//
//A number is considered a power of 2 if it has exactly **one set bit (1)** in its binary representation.
//
//        ## Examples
//
//**Example 1**
//
//        ```
//Input: 16
//Output: Yes
//```
//
//        **Example 2**
//
//        ```
//Input: 22
//Output: No
//```
//
//        ## Approach
//
//* Traverse the binary representation of the given number using the right shift (`>>`) operator.
//        * Count the number of set bits using the bitwise AND (`&`) operator.
//        * If the count of set bits is exactly `1`, the number is a power of 2.
//        * Otherwise, it is not.
//
//## Algorithm
//
//1. Initialize a counter to `0`.
//        2. While the number is greater than `0`:
//
//        * Check if the least significant bit is `1` using `(n & 1)`.
//        * If true, increment the counter.
//   * Right shift the number by one bit.
//3. After the loop:
//
//        * If the counter is `1`, print **"Yes"**.
//        * Otherwise, print **"No"**.
//
//        ## Time Complexity
//
//* **O(log n)**
//
//        ## Space Complexity
//
//* **O(1)**
//
//        ## Concepts Used
//
//* Bit Manipulation
//* Bitwise AND (`&`)
//* Right Shift (`>>`)
//* Counting Set Bits

package NumberSystem;

public class CheckNumber {
    public static void main(String[] args) {
        int n = 22;
        int c=0;
        while (n > 0) {
            n = (n >> 1);
            if ((n & 1) == 1) {
                c++;
            }
        }
            if (c == 1) {
                System.out.println("Yes the number is in power of 2");
            } else {
                System.out.println("No the number is not in the power of 2");
            }


    }
}

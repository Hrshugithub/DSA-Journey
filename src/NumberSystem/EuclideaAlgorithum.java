/*
------------------------------------------------------------
Problem: Euclidean Algorithm (Greatest Common Divisor - GCD)

Description:
The Euclidean Algorithm is an efficient method to find the
Greatest Common Divisor (GCD) of two integers.

Algorithm:
1. If a % b == 0, then b is the GCD.
2. Otherwise, recursively call the function with:
      GCD(b, a % b)
3. Repeat until the remainder becomes 0.

Example:
Input:
a = 252
b = 198

Output:
18

Explanation:
252 % 198 = 54
198 % 54 = 36
54 % 36 = 18
36 % 18 = 0
Therefore, GCD = 18

Approach:
- Use recursion to repeatedly replace the larger number
  with the remainder.
- Stop when the remainder becomes zero.

Time Complexity: O(log(min(a, b)))
Space Complexity: O(log(min(a, b)))  // Recursive call stack

Concepts Used:
- Recursion
- Modulo Operator
- Number Theory

Date Solved: 01-07-2026
Language: Java
------------------------------------------------------------
*/
package NumberSystem;

public class EuclideaAlgorithum {
    public static void main(String[] args) {
        System.out.println(eucli(252,198));
    }
    static int eucli(int a,int b){
        if(a%b==0){
            return b;
        }
        return eucli(b,a%b);

    }
}

//# Binary Exponentiation (Fast Power Algorithm) in Java
//
//This project demonstrates how to calculate **a<sup>b</sup>** efficiently using the **Binary Exponentiation** (also known as **Fast Exponentiation**) algorithm. Instead of multiplying the base repeatedly, the algorithm squares the base and halves the exponent in each iteration, reducing the time complexity from **O(n)** to **O(log n)**.
//
//The implementation uses bitwise operators to optimize the calculation:
//
//        * `& 1` is used to check whether the exponent is odd.
//* `>> 1` is used to divide the exponent by 2 efficiently.
//
//### Features
//
//* Efficient power calculation using Binary Exponentiation.
//        * Uses bitwise operations for better performance.
//        * Time Complexity: **O(log n)**
//        * Space Complexity: **O(1)**
//        * Beginner-friendly and suitable for coding interviews, competitive programming, and DSA practice.

    package NumberSystem;

    public class Power {
        public static void main(String[] args) {
            int base=3;
            int pow=6;
            int ans=1;
            while(pow>0){
                if((pow&1)==1){
                    ans*=base;
                }
                base*=base;
                pow=pow>>1;
            }
            System.out.println(ans);
        }
    }

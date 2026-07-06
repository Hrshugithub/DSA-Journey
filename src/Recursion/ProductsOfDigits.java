package Recursion;

public class ProductsOfDigits {

        public static void main(String[] args) {
            System.out.println(sumofdigits((223)));
        }
        static int sumofdigits(int n){
            if(n<10){
                return n;
            }
            return n%10*sumofdigits(n/10);
        }
    }
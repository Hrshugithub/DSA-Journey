//Program to find the factor of a number
package NumberSystem;

public class Factors {
    public static void main(String[] args) {
        int n=20;
//        factor1(n);
        factors2(n);
    }
    //O(n) complexity
    static void factor1(int n){
        for (int i = 1; i <=n/2; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }

        }

    }
//    O(root of n) complexity
    static void factors2(int n){
        int i=1;
        while(i*i<n){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }
            i++;
        }
    }
}

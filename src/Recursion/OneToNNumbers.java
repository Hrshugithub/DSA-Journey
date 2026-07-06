//Basic recursion question
package Recursion;

public class OneToNNumbers {
    public static void main(String[] args) {
        recursion1(5);
        recursion2(5);
        recursion3(5);
    }
    static void recursion1(int n) {

        if (n==0) {
            return;

        }
        System.out.print(n+" ");
        recursion1(n-1);

    }static void recursion2(int n) {

        if (n==0) {
            return;

        }
        recursion2(n-1);
        System.out.print(n+" ");

    }static void recursion3(int n) {

        if (n==0) {
            return;

        }
        System.out.print(n+" ");
        recursion3(n-1);
        System.out.print(n+" ");

    }
}

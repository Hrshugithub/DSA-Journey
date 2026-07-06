package Recursion;

public class Reverse {
    public static void main(String[] args) {
    reverse(1234);
        System.out.println(sum);
    }
    static int sum=0;
    static void reverse(int n){
        int rem=0;
        if(n==0){
            return;
        }
        rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}

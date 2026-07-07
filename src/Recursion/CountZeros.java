package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        count(1001000001);
        System.out.println(c);
    }

    static int c=0;
    static void count(int n){
        if(n<10){
            return;
        }
        if(n%10==0){
            c++;
        }
        count(n/10);
    }
}

// Normal gcd question

package NumberSystem;

public class Gcd {
    public static void main(String[] args){
        int a=30;
        int b=42;
        int min=(a>b)?b:a;
//        System.out.println(min);
        for (int i = min; i >=1 ; i--) {
            if(a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }

        }
    }

}

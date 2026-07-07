package ArrayRecursion;

public class CheckSort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,9,6};
        check(arr);
        if(i==arr.length-1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
    static int i=0;
    static void check(int[] arr){
        if(arr[i]>=arr.length){
            return;
        }
        if(arr[i]<arr[i+1]){
            i++;
            check(arr);
        }
        else{
            return;
        }
    }
}

package ArrayRecursion;

public class CheckSort2 {
    public static void main(String[] args) {
        int[] arr={1,3,3,4,5,6};
        System.out.println(check(arr,0));

    }
    static boolean check(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1]&&check(arr,index+1);
    }
}

package ArrayRecursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5,6};
        System.out.println(search(nums,8,0));
    }
    static boolean search(int[] arr,int k,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==k||search(arr,k,index+1);
    }
}


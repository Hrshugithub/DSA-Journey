package ArrayRecursion;
import java.util.*;
public class MergeSort {
    static void main() {
        int [] arr={5,4,10,2,1};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,end,mid);
    }
    static void merge(int[] arr1,int start,int end,int mid){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            if(arr1[i]<=arr1[j]){
                temp[k++]=arr1[i++];
            }else{
                temp[k++]=arr1[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr1[i++];
        }while(j<=end){
            temp[k++]=arr1[j++];
        }
        for (int l = start ;l <=end; l++) {
            arr1[l]=temp[l-start];

        }
    }
}

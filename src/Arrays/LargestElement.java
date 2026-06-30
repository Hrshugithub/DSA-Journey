package Arrays;

public class LargestElement {

    public int largest(int[] nums) {
        sort(nums);
        return nums[nums.length - 1];
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};

        LargestElement obj = new LargestElement();
        System.out.println(obj.largest(nums));
    }
}
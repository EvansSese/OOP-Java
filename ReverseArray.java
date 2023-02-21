import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //the given array
        int[] arr = {1,2,3,4,5};
        //create a copy of the array
        int[] rev_arr = new int[arr.length];
        int idx = arr.length -1;

        for (int i = 0; i < arr.length; i++){
            rev_arr[idx] = arr[i];
            idx --;
        }

        System.out.println(Arrays.toString(rev_arr));
    }
}

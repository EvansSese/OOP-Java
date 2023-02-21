public class MinVal {
    public static void main(String[] args) {
        int[] arr = {2,6,-5,0,9,10};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

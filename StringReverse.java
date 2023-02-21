public class StringReverse {
    public static void main(String[] args) {
        String str = "ABcdEfGh";
        String rev_str = "";
        String[] str_arr = str.split("");
        for (int i = str_arr.length-1; i>=0; i--){
            rev_str = rev_str + str_arr[i];
        }

        System.out.println(rev_str);
    }

}

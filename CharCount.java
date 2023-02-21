public class CharCount {
    public static void main(String[] args) {
        String str = "Madam";
        char c = 'a';
        int count = 0;

        char[] chr_arr = str.toCharArray();

        for (char ch: chr_arr){
            if (ch == c){
                count++;
            }
        }

        System.out.println(count);
    }
}

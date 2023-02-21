public class RaisePower {
    public static void main(String[] args) {
        int base = 6;
        int exp = 1;
        int product = 1;

        while(exp > 0){
            product = product * base;
            exp --;
        }

        System.out.println(product);
    }
}

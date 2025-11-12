public class ReverseInteger {
    void main() {
        IO.println(reverse(123));
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) { //123, 12, 1, 0
            int digit = x % 10; // 3, 2, 1
            //Overflow check
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit; //3 , 3 * 10 + 2 == 32, 32 * 10 + 1 = 321
            x = x / 10; //123/ 10 , 12, 1 , 0
        }
        return rev;
    }
}

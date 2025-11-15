//https://leetcode.com/problems/palindrome-number/description/
public class Palindrome {
    void main() {
        IO.println(isPalindrome(10)); //
    }

//1221 : 4 , 121 : 5:  2.5
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}


//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    /*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
     */
    void main() {
        IO.println(romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        //LVIII
        for (int i = s.length() - 1; i >= 0; i--) { // 4, 3, 2, 1, 0, -1
            int current = characterToInt(s.charAt(i)); //I: 1, I: 1, I: 1, V: 5, L: 50
            if (current < prev) { //1 < 0 , 1 < 1, 1 < 1, 5 < 1, 50 < 5
                total -= current;
            }else {
                total += current; //1 , 2 , 3, 8, 58
            }
            prev = current; //1, 1, 1, 5, 50
        }

        return total;
    }

    private int characterToInt(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {
    void main() {
        IO.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public String longestCommonPrefixHorizontal(String[] strs) {
        String prefix = strs[0]; // Dog
        for (int i = 1; i < strs.length; i++) { // 1, 2, 3
            while (!strs[i].startsWith(prefix)) { //racecar != dog, racecar != do, racecar != d
                prefix = prefix.substring(0, prefix.length() - 1); // do, d, ""
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}

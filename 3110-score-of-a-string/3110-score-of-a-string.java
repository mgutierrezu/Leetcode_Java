class Solution {
    public int scoreOfString(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int restaAbs = Math.abs(((int) s.charAt(i)) - ((int) s.charAt(i+1)));
            count = count + restaAbs;
        }
        return count;
    }
}
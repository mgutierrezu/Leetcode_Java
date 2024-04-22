class Solution {
    public String removeStars(String s) {

        // Tranformamos string a stringBuilder.
        StringBuilder sb = new StringBuilder(s);

        // Removemos todos los * y la letra anterior.
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                sb.delete(i - 1, i + 1);
                i = i - 2;
            }
        }
        return sb.toString();
    }
}
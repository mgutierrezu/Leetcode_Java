class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<String> jewel = new HashSet<String>();
        int count = 0;

        for(int i = 0; i < jewels.length(); i++) {
            jewel.add(String.valueOf(jewels.charAt(i)));
        }

        for(int i = 0; i < stones.length(); i++) {
            if (jewel.contains(String.valueOf(stones.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
}
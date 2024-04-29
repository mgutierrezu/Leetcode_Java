class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> lista = new HashSet<Integer>();
        
        for (int num : nums) {
            lista.add(num);
        }

        for(int i = 0; i <= nums.length; i++) {
            if (lista.contains(i) == false) {
                return i;
            }
        }

        return -1;
    }
}
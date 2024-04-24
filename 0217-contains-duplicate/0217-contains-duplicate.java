class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> map = new HashSet<Integer>();

        for (int num : nums) {
            if (map.add(num)) {
                map.add(num);
            }
            else return true;
        }
        return false;
    }
}
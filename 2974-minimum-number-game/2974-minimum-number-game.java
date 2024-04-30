class Solution {
    public int[] numberGame(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i+=2) {
            result.add(nums[i+1]);
            result.add(nums[i]);
        }

        int[] sol = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sol[i] = result.get(i);
        }
        
        return sol;
    }
}
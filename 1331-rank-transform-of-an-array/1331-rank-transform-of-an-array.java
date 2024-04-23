class Solution {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>();
        int[] orden = Arrays.copyOf(arr, arr.length);
        int[] result = new int[arr.length];
        Arrays.sort(orden);
        int key = 1;

        for (int i = 0; i < orden.length; i++) {
            if (!ranks.containsKey(orden[i])) {
                ranks.put(orden[i], key);
                key++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = ranks.get(arr[i]);
        }

        return result;



        
    }
}
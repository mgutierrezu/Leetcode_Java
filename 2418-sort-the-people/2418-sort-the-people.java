class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer, String> datos = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i < names.length; i++) { 
            datos.put(heights[i], names[i]);
        }



        String[] stringArray = datos.values().toArray(new String[0]);


        return stringArray;
        
    }
}
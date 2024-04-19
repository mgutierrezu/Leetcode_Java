class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        List<Integer> lista = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++) { 
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                lista.add(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            sum = sum + lista.get(i);
        }

        return sum;
    }
}
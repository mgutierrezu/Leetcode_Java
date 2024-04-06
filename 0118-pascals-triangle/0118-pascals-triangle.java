class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> total = new ArrayList<>();

        //poblamos de puros 1 la matriz triangular
        for (int j = 0; j < numRows; j++) {
            List<Integer> fila = new ArrayList<>();
            for (int i = 0; i <= j; i++) {
                fila.add(1);
            }
            total.add(fila);
        }

        for (int j = 2; j < numRows; j++) {

                int a = 0;
                int b = 1;

            for (int i = 1; i < total.get(j).size() - 1; i++) {
                
                total.get(j).set(i, total.get(j-1).get(a) + total.get(j-1).get(b));
                a++;
                b++;
                

            }

        }



        return total;
    }
}
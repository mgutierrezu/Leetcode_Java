class Solution {
    public int hammingWeight(int n) {
        String binario = String.valueOf(Integer.toBinaryString(n));
        int suma = 0;
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                suma++;
            }
            else continue;
        }
        return suma;
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        // Inicializando variables
        String numero = String.valueOf(n);
        int[] digitos = new int[numero.length()];
        
        // Parsear char a int.
        for (int i = 0; i < numero.length(); i++) {
            digitos[i] = Character.getNumericValue(numero.charAt(i));
        }

        //Suma de digitos
        int suma = 0;
        for (int i = 0; i < digitos.length; i++) {
            suma = suma + digitos[i];
        }
        //producto de digitos
        int producto =  digitos[0];
        for (int i = 1; i < digitos.length; i++) {
            producto = producto * digitos[i];
        }


        return (producto - suma);
    }
}
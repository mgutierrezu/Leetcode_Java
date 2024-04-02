class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Arreglo de coleccion de pares
        char[][] pares = new char[s.length()][2];

        //Guardado de pares de caracteres
        for (int i = 0; i < s.length(); i++) {
            pares[i][0] = s.charAt(i);
            pares[i][1] = t.charAt(i);
        }

        //Logica de analisis para verificar isomorfismo
        for (int j = 0; j < pares.length; j++) {
            char firstChar = pares[j][0];
            char secondChar = pares[j][1];
            for (int k = 0; k < pares.length; k++) {
                if (pares[k][0] != firstChar && pares[k][1] == secondChar) {
                    return false;
                }
                else if (pares[k][0] == firstChar && pares[k][1] != secondChar) {
                    return false;
                }
                else continue;
            }
        }
           return true;
    }
}
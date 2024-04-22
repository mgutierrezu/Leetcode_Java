class Solution {
    public int mostWordsFound(String[] sentences) {
        
        // guardar numero de palabras de cada frase
        int[] palabra = new int[sentences.length];

        // contar el numero de palabras por frase.
        for (int i = 0; i < sentences.length; i++) {
            int mayor = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    mayor++;
                }
            }
            palabra[i] = mayor;
        }
        
        
        // ordenar la cantidad de palabras, orden ascendente.
        Arrays.sort(palabra);

        // devolver el valor mas alto de la lista.
        return palabra[sentences.length - 1];


    }
}
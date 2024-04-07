class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // Usamos stringbuilder
        StringBuilder palabra1 = new StringBuilder();
        StringBuilder palabra2 = new StringBuilder();

        // Llenamos las palabras con el metodo .append
        for (String word : word1) {
            palabra1.append(word);
        }
        for (String word : word2) {
            palabra2.append(word);
        }

        // Usamos operacion ternaria para comparar ambas palabras
        return (palabra1.toString().equals(palabra2.toString())) ? true : false;

    }
}
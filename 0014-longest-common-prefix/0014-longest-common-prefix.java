class Solution {
    public String longestCommonPrefix(String[] strs) {

        String corto = strs[0];
        String prefix = "";

        // encontrar la palabra mas corta.
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < corto.length()) {
                corto = strs[i];
            }
        }

        //iteracion de las letras
        for (int j = 0; j < corto.length(); j++) {

            //iteracion de las palabras
            for (int i = 0; i < strs.length; i++) {

                if ( strs[i].charAt(j) != corto.charAt(j) ) {
                    return prefix;
                }
                else continue;

            }

            prefix = prefix.concat( String.valueOf(corto.charAt(j)) );

        }

        return prefix;
    }
}
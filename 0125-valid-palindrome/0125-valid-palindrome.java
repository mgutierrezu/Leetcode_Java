class Solution {
    public boolean isPalindrome(String s) {
        // cambiamos todo a minusculas
        s = s.toLowerCase();

        StringBuilder string = new StringBuilder();
        StringBuilder stringReverse = new StringBuilder();

        // Sacamos todos los otros caracteres que no sean letras
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                string.append(s.charAt(i));
            }
        }

        // Cambiamos el Stringbuilder por String.
        String newstring = string.toString();

        // Revisamos si es palindromo el newstring.
        for (int i = newstring.length() - 1; i >= 0; i--) {
            stringReverse.append(newstring.charAt(i));
        }

        String newStringReverse = stringReverse.toString();

        return (newstring.equals(newStringReverse)) ? true : false;
    }
}
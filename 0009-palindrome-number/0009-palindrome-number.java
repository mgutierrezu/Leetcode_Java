class Solution {
    public boolean isPalindrome(int x) {
        // Transforma el numero a cadena de caracteres.
        String numero = Integer.toString(x);
        
        // Itera en la cadena, en busqueda del numero palindromo.
        for (int i = 0; i <= (numero.length() / 2); i++) {
            if (numero.charAt(i) != numero.charAt(numero.length() - 1 - i)) {
                return false;
            }
            else continue;
        }
        return true;
    }
}
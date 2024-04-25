class Solution {
    public int addDigits(int num) {
        
        String numeros = String.valueOf(num);
        int sum = 0;

    do {
        sum = 0;
        for (int i = 0; i < numeros.length(); i++) {
            sum = sum + Character.getNumericValue(numeros.charAt(i));
        }
        numeros = String.valueOf(sum);
    }
   while ( sum >= 10 );

    return sum;
    }
}
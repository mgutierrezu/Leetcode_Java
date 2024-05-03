import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        
       // long valor1 = Long.parseLong(num1);
        //long valor2 = Long.parseLong(num2);

        BigInteger valor1 = new BigInteger(num1);
         BigInteger valor2 = new BigInteger(num2);
         BigInteger result = valor1.add(valor2);



        return String.valueOf(result);

    }
}
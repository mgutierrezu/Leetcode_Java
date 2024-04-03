class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = (digits.length - 1); i >= 0; i--) {

            if ((digits[i] == 9 || digits[i] == 10) && i != 0) {

                digits[i] = 0;

                if (digits[i - 1] == 8) {
                    digits[i - 1] = 9;
                    break;
                } 
                else {
                    // digits[i - 1] = digits[i - 1] + 1;
                }

            } 
            
            else if (digits[0] == 10) {
                break;
            }

            else {
                digits[i]++;
                break;
            }
        }


        if (digits[0] == 10) {
            int[] solucion = new int[digits.length + 1];
            solucion[0] = 1;
            solucion[1] = 0;
            for (int i = 2; i <= digits.length; i++) {
                solucion[i] = digits[i - 1];
            }
            return solucion;
        } else
            return digits;
    }
}
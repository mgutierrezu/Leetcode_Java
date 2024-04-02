class Solution {
    public int romanToInt(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'M') {
                count = count + 1000;
            }
            else if(i <= (s.length() -2) && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                count = count + 900;
                i++;
            }
            else if(s.charAt(i) == 'D') {
                count = count + 500;
            }
            else if(i <= (s.length() -2) && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                count = count + 400;
                i++;
            } 
            else if(s.charAt(i) == 'C') {
                count = count + 100;
            } 
            else if(i <= (s.length() -2) && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                count = count + 90;
                i++;
            } 
            else if(s.charAt(i) == 'L') {
            count = count + 50;
            } 
            else if(i <= (s.length() -2) && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                count = count + 40;
                i++;
            } 
            else if(s.charAt(i) == 'X') {
            count = count + 10;
            } 
            else if(i <= (s.length() -2) && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                count = count + 9;
                i++;
            } 
            else if(s.charAt(i) == 'V') {
                count = count + 5;
            } 
            else if(i <= (s.length() -2) && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                count = count + 4;
                i++;
            } 
            else if(s.charAt(i) == 'I') {
            count = count + 1;
            } 
        }
        return count;
    }
}
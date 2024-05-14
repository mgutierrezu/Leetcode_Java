class Solution {
    public int dayOfYear(String date) {

        int mes = Integer.valueOf(date.substring(5, 7));
        int dia = Integer.valueOf(date.substring(8));
        int ano = Integer.valueOf(date.substring(0, 4));

        switch (mes) {
            case 2:
                dia = dia + 31;
                break;
            case 3:
                dia =  dia + 59;
                break;
            case 4:
                dia =  dia + 90;
                break;
            case 5:
                dia =  dia + 120;
                break;
            case 6:
                dia =  dia + 151;
                break;
            case 7:
                dia =  dia + 181;
                break;
            case 8:
                dia =  dia + 212;
                break;
            case 9:
                dia =  dia + 243;
                break;
            case 10:
                dia =  dia + 273;
                break;
            case 11:
                dia =  dia + 304;
                break;
            case 12:
                dia =  dia + 334;
                break;
        }

        if (ano % 4 == 0 && ano % 100 != 0 && mes > 2) {
            dia++;
        } else if (ano % 400 == 0 && mes > 2){ 
            dia ++;
            
        }
        
        return dia;
    }
}
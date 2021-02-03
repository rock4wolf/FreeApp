
public class DateData {
    String date[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","domingo"};
    String month[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    Boolean check_leap(int year){//verifica si es año bisiesto
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return false;
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    

}
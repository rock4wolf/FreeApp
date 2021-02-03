/*
descripcion del programa: clase creada como herramienta de escritura
nombre del alumno: Erik Serguei Amador Zamora
matricula:AZEO180087
grado y grupo:5°C
*/
import java.util.Scanner;

class teclado{
    Scanner sc =new Scanner(System.in);

    //*********constructores*******

    String read_string(){
        return sc.nextLine();
    }

    float read_float(){
        return sc.nextFloat();
    }

    double read_double(){
        return sc.nextDouble();
    }

    int read_int(){
        return sc.nextInt();
    }

    char read_char(){
        return sc.nextLine().charAt(0);
    }
}
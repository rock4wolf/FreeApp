
public class personal_data {
    int age;
    int sex;
    String freq;
    String status;
    String allergy;
    String desease;
    teclado key = new teclado();
    String frec[] ={"alta","media","baja","ninguna"};
    String stat[] ={"soltero","pareja estable"};

    void fill_data(){
        int opc;
        System.out.println("edad: ");
        age=key.read_int();
        System.out.println("sexo: 1.-M 2.-F");
        sex=key.read_int();
        System.out.println("frecuencia de actividad sexual: ");
        show_freq();
        opc = key.read_int();
        freq=frec[opc-1];
        System.out.println("estado actual: ");
        show_status();
        opc = key.read_int();
        status=stat[opc-1];

        //alergias
        /*System.out.println("alergias: ");
        allergy=key.read_string();*/
        System.out.println("enfermedades: ");
        desease = key.read_string();
    }

    void show_data(){
        System.out.println("edad: "+age);
        System.out.println("sexo: "+sex);
        System.out.println("frecuencia de actividad sexual: "+freq);
        System.out.println("estado actual: "+status);
        System.out.println("alergias: "+allergy);
        System.out.println("enfermedades: "+desease);
    }

    void refresh_data(){
        boolean flag=true;
        int opc;
        System.out.println("1.-edad: "+age);
        System.out.println("2.-sexo: "+sex);
        System.out.println("3.-frecuencia de actividad sexual: "+freq);
        System.out.println("4.-estado actual: "+status);
        System.out.println("5.-alergias: "+allergy);
        System.out.println("6.-enfermedades: "+desease);
        System.out.println("7.-regresar");
        opc=key.read_int();
        switch (opc) {
            case 1:
                //cambiar edad
                age=key.read_int();
                refresh_data();
                break;
            case 2:
                //cambiar sexo
                sex=key.read_char();
                refresh_data();
                break;
            case 3:
                freq=key.read_string();
                refresh_data();
                //cambiar frecuencia
                break;
            case 4:
                //cambiar estado
                status=key.read_string();
                refresh_data();
                break;
            case 5:
                //cambiar alergias
                allergy=key.read_string();
                refresh_data();
                break;
            case 6:
                //cambiar enfermedades
                desease=key.read_string();
                refresh_data();
                break;
            case 7:
                flag = false;
                //regresar
                break;
        
            default:
                break;
        }
        if(flag){
            //actualizar datos en la base 
            //posicion del campo
        }
    }

    void show_freq(){
        for(int i=0;i<frec.length;i++){
            System.out.println((i+1)+".-"+frec[i]);
        }
    }

    void show_status(){
        for(int i=0;i<stat.length;i++){
            System.out.println((i+1)+".-"+stat[i]);
        }
    }

    void show_aller(){
        int opc;
        System.out.println("cuentas con alergias?: 1.-si 2.-no");
        opc=key.read_int();
        switch(opc){
            case 1:
                System.out.println("tu alergia es alguna de estas?:\n1.-latex\n2.-medicamentos");
                opc=key.read_int();
                switch(opc){
                    case 1://latex
                    break;
                    case 2://medicamentos
                    break;
                }
                break;
            case 2:
                break;
        }
    }
}
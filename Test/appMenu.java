import javax.swing.JOptionPane;

class appMenu {
    teclado key = new teclado();
    user temp = new user();
    personal_data pd = new personal_data();
    recommend rc = new recommend();
    calendario cal = new calendario();
    DateData DatDat = new DateData(); 
    String user;
    String Pass;
    //menu preguntar si es registro o login
    void menu_ask(){
        int opc;
        System.out.println("1.-crear nuevo usuario");
        System.out.println("2.-ingresar con usuario existente");
        opc=key.read_int();
        switch (opc) {
            case 1:
                //menu registro
                menu_register();
                break;
            case 2:
                menu_login();
                break;

            default:
                break;
        }
    }

    void menu_register(){
        String p1;
        String p2;
        System.out.println("ingrese el usuario: ");
        String aux=key.read_string();
        aux=key.read_string();
        System.out.println("ingrese la contraseña: ");
        p1=key.read_string();
        System.out.println("ingrese nuevamente la contraseña:");
        p2=key.read_string();
        if(p1.equals(p2)){
            //abrir tabla de usuarios y buscar que no se repita el usuario
            /*if(aux.equals()){
                nombre de usuario ya existe
            }si no existe  */
            //usar create_user de user.java
            //añadir usuario a la base de datos en tabla user
            JOptionPane.showMessageDialog( null, "Usuario creado con exito");
            //cambiar a menu principal
            firstadd_data();
            main_menu();
        }else{
            JOptionPane.showMessageDialog( null, "Vaya, algo ha salido mal");
            //intentar de nuevo
            menu_register();
        }
    }

    //menu login
    void menu_login(){
        //Se podria usar JOPtion pane
        //boton de registro
        System.out.println("\tbienvenido!\n\n");
        System.out.printf("Usuario: ");
        user = key.read_string();
        user = key.read_string();
        System.out.printf("Contraseña: ");
        Pass = key.read_string();
        if(temp.check_user(user,Pass)){
            //ingresar al menu principal
            main_menu();
        }else{
            JOptionPane.showMessageDialog( null, "No se encontro el usuario");
            main_menu();//solo para prueba
            //intentar de nuevo
            /*se podria buscar usuario si es que existe
            pero la contraseña es incorrecta*/
            //menu_login();
        }
        //abrir tabla user

    }
    //menu de usuario
    void main_menu(){
        int opc;
        System.out.println("\tMenu\n");
        //mostrar nombre de usuario y salto de linea
        //podria ser un menu desplegable
        System.out.println("1.-Datos personales");
        System.out.println("2.-Recomendaciones");
        System.out.println("3.-Calendario");
        System.out.println("4.-recordatorios");
        System.out.println("5.-salir");
        opc=key.read_int();
        switch (opc) {
            case 1:
                //mostrar menu de datos personales
                menu_personal();
                break;
            case 2:
                //mostrar Recomendaciones
                rc.show_recomend();
                break;
            case 3:
                //mostrar menu de calendario
                break;
            case 4:
                menu_recordatorio();
                //mostrar menu de recordatorios
                break;
            case 5:
                //salir
                break;
        
            default:
                break;
        }
    }

    void menu_personal(){
        int opc;
        System.out.println("\tDatos personales");
        System.out.println("1.-ver datos");
        System.out.println("2.-actualizar datos");
        System.out.println("3.-regresar");
        opc=key.read_int();
        switch (opc) {
            case 1:
                //mostrar los datos
                pd.show_data();
                main_menu();
                break;
            case 2:
                //actualizar los datos
                pd.refresh_data();
                main_menu();
                break;

                case 3:
                    main_menu();
                    break;
        
            default:
                break;
        }
    }

    void firstadd_data(){
        //solo se usa cuando se crea un usuario por primera vez
        //tabla de datos personales referenciada al nombre de usuario
        System.out.println("para que la aplicacion funcione,\nnecesitaremos saber unas cuantas cosas de ti:\n");
        pd.fill_data();
    }

    void menu_recordatorio(){
        int dia;
        int opc;
        String title;
        String hour;
        System.out.println("\tMenu de recordatorios");
        System.out.println("seleccione:");
        System.out.println("1.-ver recordatorios");
        System.out.println("2.-crear recordatorio");
        System.out.println("3.- eliminar recordatorio");
        opc=key.read_int();
        switch(opc){
            case 1://mostrar recordatorios
                break;
            case 2://crear recordatorios
                System.out.println("titulo: ");
                title=key.read_string();
                title=key.read_string();
                System.out.println("hora: ");
                hour=key.read_string();
                System.out.println("repeticion:");
                System.out.println("\t1.-dia");
                System.out.println("\t2.-semana");
                System.out.println("\t3.-mes");
                System.out.println("\t4.-año");
                opc=key.read_int();
                switch(opc){
                    case 1://dia
                        System.out.println("ingrese la fecha:");
                        break;
                    case 2://semana
                        boolean exit = false;
                        int num;
                        boolean nday[];
                        String opciones_dia;
                        nday = new boolean[DatDat.date.length];
                        for(int i=0;i<nday.length;i++){
                            nday[i]=false;
                        }
                        do{
                            System.out.println("ingrese el dia:");
                            for(int i=0;i<DatDat.date.length;i++){
                                System.out.printf("\t%d.-",i+1);
                                if(!nday[i]){
                                    System.out.printf("%s\n",DatDat.date[i]);
                                }else{
                                    System.out.printf("\n");
                                }   
                            }
                            System.out.println("elegir dia: ");
                            num=key.read_int();
                            nday[num-1]=true;
                            System.out.println("agregar otro dia?\n1.-si\n2.-no");
                            if(key.read_int()==1){
                                exit = true;
                            }
                            else{
                                exit = false;
                            }
                        }while(exit);
                        //crear archivo con recordatorios si no existe y guardar info
                        break;

                }
            case 3://eliminar recordatorios
                break;
        }
    }
    //menu admin
    //menu friend
    //ask user??
}
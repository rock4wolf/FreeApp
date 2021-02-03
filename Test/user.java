class user{
    String name;
    int id_user;
    String pass;
    String users[];


//aqui se necesita manipulacion de archivos

    void create_user (){
        //si no se encuentra
        //solicitar datos
        //almacenar registro    
    }
    
    boolean check_user(String U, String P){
        boolean result;
        //verificar que el usuario se encuentra en la base
        //readfile
        //leer archivo UserDB.txt
        ReadFile rd = new ReadFile("UserDB.txt");
        users = rd.read_per_String();
        for(int f=0; f<users.length && users[f] != null; f++){
            if(users[f].contains(U)){
                if(users[f].contains(P)){
                    return true;
                }
            }
        }
        return false;
    }

}
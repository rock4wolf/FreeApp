import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class ReadFile{
    private FileReader fr;
    private File file;
    private Scanner input;
    private String file_name;

    
    ReadFile(String fname){
        this.file_name = fname;
    }
    

    String [] read_per_String(){//lee el archivo cadena por cadena
        String tmp[]= new String[1000000];
        int k=0;
        try{
            /* open file */
            input = new Scanner(new File(file_name));
            
            /* read file */
            while(input.hasNext()){
                tmp[k]= input.nextLine();
                k++;
            }
            
            /* close file */
            if(input != null)
                input.close();
        } /* end try */
        
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
        
        catch(NoSuchElementException elementException){
            System.err.println("Archivo corrompido :'(");
            System.exit(1);
        }
        
        catch ( IllegalStateException stateException ){
            System.err.println( "Error al leer del archivo." );
            System.exit(1);
        }
        return tmp;
    }
}
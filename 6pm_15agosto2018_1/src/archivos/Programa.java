package archivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\crl\\salida.txt", true);
            
//            fw.write(System.lineSeparator() + "hola compañeros 4");            
//            fw.flush();
            fw.close();            
        } catch (IOException ex) {            
        }
        
        try {
            String[] lineasrchivo = Files.readAllLines(Paths.get("C:\\crl\\salida.txt"), StandardCharsets.UTF_8).toArray(new String[]{});
            
            for(String linea: lineasrchivo) {
                System.out.println(linea);                
            }
        } catch (IOException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}

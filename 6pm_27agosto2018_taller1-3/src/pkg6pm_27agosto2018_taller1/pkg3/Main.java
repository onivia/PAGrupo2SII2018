package pkg6pm_27agosto2018_taller1.pkg3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        item1();        
    }
    
    private static void item1() {
        String vocal = "í";
        boolean[] respuesta = validaVocal(vocal);
        
        System.out.println(Arrays.toString(respuesta));        
    }

    private static boolean[] validaVocal(String vocal) {
        boolean[] resultado = {false,false};
        
        int cantVocales = 5;
        String[] vocalesTildadas = {"á","é","í","ó","ú"};
        String[] vocalesMinusculas = {"a","e","i","o","u"};        
        
        for (int i = 0; i < cantVocales; i++) {
            if(vocal.equals(vocalesTildadas[i])) {
                resultado[0] = true; //esta tildada                
                resultado[1] = true; //es minuscula
                break;
            }
            else if(vocal.equals(vocalesMinusculas[i])) {
                resultado[0] = false; //NO esta tildada                
                resultado[1] = true; //es minuscula
                break;
            }
            else if(vocal.toLowerCase().equals(vocalesTildadas[i]) & !vocal.equals(vocalesMinusculas[i])) {
                resultado[0] = true; //esta tildada                
                resultado[1] = false; //NO es minuscula
                break;                
            }            
        }
        
        return resultado;
    }
}

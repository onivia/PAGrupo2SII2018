package principal;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        //item1();
        item2();        
    }
    
    public static void item1() {
        int numero = 8;
        int cantcifras = 1;
        int extractor = 10;
        int separador = 1;        
        int cifra = 0;
        int i = 0;

        while(i < cantcifras) {
            cifra = (numero % extractor) / separador;
            
            System.out.println(cifra);
            
            extractor *= 10; //extractor = extractor * 10;
            separador *= 10; //separador = separador * 10;
            i++;
        }
    }

    public static void item2() {
        String vocal = "Á"; //T/F
        
        boolean[] resultado = validaVocal(vocal);
        
        System.out.println(Arrays.toString(resultado));
    }
    
    private static boolean[] validaVocal(String vocal) {
        boolean[] resultado = {false,false}; //[0]-true-esta tildada; [1]-true-minuscula
        String[] vocalesTildadas = {"á","é","í","ó","ú"};                
        
        for (int i = 0; i < vocalesTildadas.length; i++) {
            if(vocal.toLowerCase().equals(vocalesTildadas[i])) {
                resultado[0] = true;
            }
        }
        if(vocal.toLowerCase().equals(vocal)) {
            resultado[1] = true; //es minuscula            
        }        
        
        return resultado;
    }
    
    public static void item3() {
        String cadena1 = "";
        String cadena2 = "";
        
    } 
    
    public static void item4() {     
                
    }    
}

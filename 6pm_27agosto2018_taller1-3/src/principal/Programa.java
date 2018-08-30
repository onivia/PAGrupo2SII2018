package principal;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        //item1();
        //item2();        
        item5();
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

    public static void item5() {
        int[] nums = {1,1,2,3,3,3};
        int posiMasRepetido = -1;
        
        posiMasRepetido = getNumeroMasRepetido(nums);        
        if(posiMasRepetido >= 0)
            System.out.println("El Numero mas repetido es: " + nums[posiMasRepetido]);
        else
            System.out.println("NO hay repetidos o INDETERMINADO");
        
        //ordenaAscendentemente(nums);
    }
    
    private static int getNumeroMasRepetido(int[] nums) {
        int posiMasRepetido = -1;

        //{3,1,7,4,5} - {0,0,0,0,0} -> -1
        //{2,3,4,3} - {0,1,0,0} -> 1        
        //{2,3,4,3,2} - {1,1,0,0,0} -> -1
        //{5} - {0} -> 0
        
        //System.out.println(Arrays.toString(getConteoRepetidos(nums)));
        int[] arregloRepeticiones = getConteoRepetidos(nums);        
        posiMasRepetido = getPosicionMasRepetido(arregloRepeticiones);
        
        return posiMasRepetido;                        
    }
    
    private static int[] getConteoRepetidos(int[] arreglo) {
        int[] arregloRepetidos = new int[arreglo.length];
        
        //TODO
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = (i+1); j < arreglo.length; j++) {
                if(arreglo[i] == arreglo[j]) {
                    arregloRepetidos[i]++;                    
                }
            }                        
        }
        
        return arregloRepetidos;
    }
    
    private static int getPosicionMasRepetido(int[] arregloRepetidos) {        
        int posiMayor = 0;
        
        for (int i = 0; i < arregloRepetidos.length - 1; i++) {
            if(arregloRepetidos[i+1] > arregloRepetidos[posiMayor]) {
                posiMayor = i + 1;                
            }
        }
        
        for (int i = 0; i < arregloRepetidos.length; i++) {
            if(arregloRepetidos[i] == arregloRepetidos[posiMayor] && i != posiMayor) {
                posiMayor = -1;
                break;
            }                
        }
        
        return posiMayor;
    }    
    
    private static void ordenaAscendentemente(int[] arreglo) {
        boolean huboIntercambio = true;
        int aux = 0;
        
        while(huboIntercambio) {
            huboIntercambio = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                if(arreglo[i] > arreglo[i + 1]) {
                    aux = arreglo[i + 1];
                    arreglo[i + 1] = arreglo[i];
                    arreglo[i] = aux;
                    huboIntercambio = true;
                }
            }            
        }        
    }
}

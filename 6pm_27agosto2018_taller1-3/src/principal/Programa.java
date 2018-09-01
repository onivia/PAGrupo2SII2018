package principal;

import java.util.Arrays;
import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        //item1();
        //item2();        
        //item5();
        //item6();
        item7();
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
    
    public static void item6() {
        int idesde = 3;
        int ihasta = 7;
        
        int aleatorio = (new Random()).nextInt((ihasta - idesde) + 1);
        int numeroEnRango = idesde + aleatorio;
        System.out.println(numeroEnRango);
        
        //[3-7]
        //R(5) -> r1
        //(idesde + r1)
    }
    
    public static void item7() {
        /*
        {"a","e","i","o","u","b","c","d","f","g","0","1","2,"3","4","_","*","+","%"}
        
        //getSimbolo(0,15):String
        //validaRepeticion(int[] arreglo, string simbolo, int cantMaxRepeticiones):int-->cantidad de repeticiones
        //validaRepeticionContrasena(int[] contrasenas):boolean-->true-valido; false-hay al menos una repetida        
        */
        
        String[] contrasenas = new String[5];
        
        boolean alMenosHayUnaRepetida = true;
        while(alMenosHayUnaRepetida) {
            generaContrasenas(contrasenas);            
            alMenosHayUnaRepetida = validaRepeticionContrasena(contrasenas);
        }
        
        System.out.println(Arrays.toString(contrasenas));
    }
    
    private static void generaContrasenas(String[] contrasenas) {
        String[] contrasena = new String[5];
        boolean esValidoSimbolo = false;
        
        int i = 0;
        while(i < 5) {
            esValidoSimbolo = false;
            
            generaContrasena(contrasena);
            
            for (int j = 0; j < 5; j++) {
                esValidoSimbolo = validaRepeticion(contrasena, contrasena[j], 2);
                
                if(!esValidoSimbolo)
                    break;
            }
            
            if(esValidoSimbolo) {
                contrasenas[i] = Arrays.toString(contrasena);
                ++i;
            }
        }                
    }
    
    private static void generaContrasena(String[] contrasena) {
        for (int i = 0; i < contrasena.length; i++) {
            contrasena[0] = getSimbolo(0, 15);
            for (int j = 1; j < contrasena.length; j++) {
                contrasena[j] = getSimbolo(0, 15);
            }
        }
    }
    
    private static boolean validaRepeticionContrasena(String[] contrasenas) {
        //{"a","b","x","c"}
        boolean huboAlmenosUnaRepetida = false;
        for (int i = 0; i < contrasenas.length -1; i++) {
            for (int j = (i+1); j < contrasenas.length; j++) {
                if(contrasenas[i].equals(contrasenas[j])) {
                    huboAlmenosUnaRepetida = true;
                    break;                    
                }                                
            }
            if(huboAlmenosUnaRepetida)
                break;
        }
        
        return huboAlmenosUnaRepetida;
    }
    
    private static boolean validaRepeticion(String[] arreglo, String simbolo, int cantMaxRepeticiones) {
        boolean esValidaContrasena = false;
        int repeticionesSimbolo = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i].equals(simbolo)) {
                repeticionesSimbolo++;
            }          
        }
        
        repeticionesSimbolo = (repeticionesSimbolo > 1) ? (repeticionesSimbolo - 1) : 0;
        
        if(repeticionesSimbolo <= cantMaxRepeticiones)
            esValidaContrasena = true;
        
        return esValidaContrasena;
    }
    
    private static String getSimbolo(int desde, int hasta) {
        String[] simbolos = {"a","e","i","o","u","b","c","d","f","g","0","1","2","3","4","_","*","+","%"};
        
        int posiAletoria = getAleatorio(desde, hasta);
        
        return simbolos[posiAletoria];
    }
    
    private static int getAleatorio(int idesde, int ihasta) {
        int aleatorio = (new Random()).nextInt((ihasta - idesde) + 1);
        int numeroEnRango = idesde + aleatorio;

        return numeroEnRango;
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

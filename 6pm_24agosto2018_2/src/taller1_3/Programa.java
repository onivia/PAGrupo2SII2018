package taller1_3;

public class Programa {
    public static void main(String[] args) {
        ejercicio1();        
    }
    
    private static void ejercicio1() {
        int numero = 758;
        int extractor = 10;
        int separador = 1;
        int cantCifras = 3;
        int cifra = 0;
        int i = 0;
        while(i < cantCifras) {
            cifra = (numero % extractor) / separador;
            System.out.println(cifra);
            
            extractor *= 10; //extractor = extractor * 10;
            separador *= 10;            
            i++;           
        }        
    }
}

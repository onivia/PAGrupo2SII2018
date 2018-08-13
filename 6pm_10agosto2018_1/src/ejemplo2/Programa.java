package ejemplo2;

public class Programa {
    public static void main(String[] args) {
        int ivar1 = 453425435;
        short svar2 = 100;
        //el valor de 100 si cabe en un short, pero int no puede ser asignado
        //directamente en un short
        short svar1 = (short)ivar1;
        
        //
        float fvar1 = 100.02f;
        int ivar2 = (int)fvar1;
        
        char cvar1 = 64;
        
        System.out.println(cvar1);
    }
}

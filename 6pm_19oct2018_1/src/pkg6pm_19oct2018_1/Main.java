
package pkg6pm_19oct2018_1;

/**
 *
 * @author ONivia
 */
public class Main {
    public static void main(String[] args) {
        //usoFinalVariable();        
        comportamientoInmutableString();
    }

    private static void staticVariable() {
        Global.var1 = 100;

            ClaseA ca = new ClaseA();
            System.out.println(ca.muestraVar1());
    }
    
    private static void usoFinal() {
        ClaseB cb = new ClaseB();
        cb.muestraVar1();
    }
    
    private static void usoFinalVariable() {
        final int i;
        i = 10;
        final ClaseA ca = new ClaseA();
        ca.edad = 100;
        
        //i = 20; //cannot be reassigned
        //System.out.println(i);
        System.out.println(ca.edad);
        //ca = new ClaseA();
        ca.edad = 200;
        System.out.println(ca.edad);
        cambiaValorInstancia(ca);
    }
    
    private static void cambiaValorInstancia(final ClaseA ca) {
        //ca = new ClaseA();
        ca.edad = 500;
        ca.edad = 600;        
    }
    
    private static void comportamientoInmutableString() {
        String s1 = "hola";
        String s2 = new String("hola");
        
        //System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

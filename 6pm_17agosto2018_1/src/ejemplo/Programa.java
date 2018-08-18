package ejemplo;

public class Programa {
    public static void main(String[] args) {
        int i = 10;
        
        if(i == 10 && plusI(i) == 10) {
            System.out.println("ENTRO");
            System.out.println(i);            
        }
    }

    private static int plusI(int i) {
        
        System.out.println("entro a sumar a I");
        
        return (i++);
    }
}

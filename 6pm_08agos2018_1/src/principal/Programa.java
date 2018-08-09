package principal;

public class Programa {

    public static void main(String[] args) {
        //parentesis ( ), de ahi para alla de izq a dere
        //decremento y incremento ++ --
        //multiplicacion, division, modulo
        //suma y resta
        
        //++i preincremento, i++ postincremento
        //--i predecremento, i-- postdecremento
        int i = 10;
        int j = 5;
        int operacion = 5 + 2 * 4 + ++i - 5 + j-- - 2 + j;
        //i=11, j=4
        //5 + 2 * 4 + 11 - 5 + 5 - 2 + 4
        //5 + 8 + 11 -5 + 5 -2 + 4
        //24 - 5 + 5 - 2 + 4
        //24 - 2 + 4
        //22 + 4 = 26
        System.out.println(operacion);
        System.out.println(i);
        System.out.println(j);
    }    
}

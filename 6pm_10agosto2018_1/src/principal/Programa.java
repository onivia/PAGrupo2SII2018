package principal;

public class Programa {
    public static void main(String[] args) {
        int ivar1;
        //asigancion de valores a un arreglo paso a paso
        int[] numeros1 = new int[3];
        numeros1[0] = 100;
        numeros1[1] = 200;
        numeros1[2] = 300;
        
        int[] numeros2 = {10,80};
        
        //[2][2][3]
        int[][][] numeros3 = {
            {
                {10,20,30},
                {40,50,60}            
            },
            {
                {70,80,90},
                {100,110,120}            
            }
        };
        
        System.out.println(numeros3[1][1][0]);
    }   
}

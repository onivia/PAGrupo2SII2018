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
        
        for(int i : numeros2) {
            System.out.println(i);            
        }
        
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
        
        for(int[][] d1 : numeros3) {
            for(int[] d2 : d1) {
                for(int i : d2) {
                    //System.out.println(i);
                }
            }            
        }
    }   
}

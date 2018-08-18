package principal;

import enums.EnumsGenerales;

public class Programa {

    public static void main(String[] args) {
        EnumsGenerales.DiasSemana dia = EnumsGenerales.DiasSemana.VIERNES;
        
        int ivar1 = 2;
        EnumsGenerales.DiasSemana otrodia = EnumsGenerales.DiasSemana.fromInt(ivar1);
        
        if(otrodia.getValorDiaSemana() == 2)
            System.out.println("si es MARTES");
        
        if(otrodia == EnumsGenerales.DiasSemana.MARTES)
            System.out.println("tambn es MARTES");
    }
}

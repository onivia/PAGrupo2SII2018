package enums;

public class EnumsGenerales {
    public enum DiasSemana {
        LUNES(1),
        MARTES(2),
        VIERNES(5);
        
        private int valordiasemana;        
        
        DiasSemana(int valordiasemana) {
            this.valordiasemana = valordiasemana; 
        }
        
        public int getValorDiaSemana() {
            return this.valordiasemana;
        }
        
        public static DiasSemana fromInt(int valordiasemana) {
            switch (valordiasemana) {
                case 1:
                    return DiasSemana.LUNES;                    
                case 2:
                    return DiasSemana.MARTES;
                case 5:
                    return DiasSemana.VIERNES;
                default:
                    return null;
            }
        }
    }    
}

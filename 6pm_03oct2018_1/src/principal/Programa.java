package principal;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        int tipoTercero = 2;
        
        Tercero tercero = Tercero.crearTercero(tipoTercero);
        LiquidarTercero(tercero);
        
        
//        Cliente c = null;
//        Proveedor p = null;
//        
//        if(tipoTercero==1) {
//            c = new Cliente();
//            LiquidarTercero(c);
//        } else if(tipoTercero==2) {
//            p = new Proveedor();
//            LiquidarTercero(p);
//        }
    }
    
    private static void LiquidarTercero(Object tercero) {
        if(tercero instanceof Cliente) {
            Cliente c = (Cliente)tercero;
            c.liquidar();
        }
        else if(tercero instanceof Proveedor) {
            Proveedor p = (Proveedor)tercero;
            p.liquidar();
        }        
    }
    
    private static void LiquidarTercero(Tercero tercero) {
        tercero.liquidar();
    }
}

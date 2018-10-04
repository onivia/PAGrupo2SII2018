package principal;

/**
 *
 * @author ONivia
 */
public class Proveedor extends Tercero {
    public Proveedor() {
        super();
    }
    
    public void cuentasxPagar() {
        System.out.println("cuentasxPagar en Proveedor");
    }    

    @Override
    public void liquidar() {
        System.out.println("liquidar en Proveedor");
    }
}

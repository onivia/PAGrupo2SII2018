package principal;

/**
 *
 * @author ONivia
 */
public class Proveedor extends Tercero implements IRteFte, INotificable {
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

    @Override
    public void calcularRteFte() {
        FacturaVentaNacional obj = new FacturaVentaNacional();
    }

    @Override
    public void notificar() {
        System.out.println("se notifico al proveedor");        
    }
}

package principal;

/**
 *
 * @author ONivia
 */
public class FacturaExportacion extends Factura implements INotificable {
    public FacturaExportacion() {
    }    

    @Override
    public void notificar() {
        System.out.println("se notifico la FActura de Exportacion");
    }
}

package principal;

/**
 *
 * @author ONivia
 */
public abstract class Tercero {

    public Tercero() {
    }
    
    public abstract void liquidar();
    
    public void validarNit() {
        System.out.println("validarNit en Tercero");
    }
    
    public static Tercero crearTercero(int tipoTercero) {
        switch (tipoTercero) {
            case 1:
                return (new Cliente());
            case 2:
                return (new Proveedor());
            default:
                return null;
        }
    }
}

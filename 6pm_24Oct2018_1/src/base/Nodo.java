package base;

/**
 *
 * @author ONivia
 */
public class Nodo {
    public int dato;
    public Nodo sgte;

    public Nodo() {
        this.dato = 0;
        this.sgte = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.sgte = null;
    }
}

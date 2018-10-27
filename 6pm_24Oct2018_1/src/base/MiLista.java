package base;

/**
 *
 * @author ONivia
 */
public class MiLista {
    private Nodo p;
    private Nodo u;
    public int tamano;

    public MiLista() {
        this.p = null;
        this.u = null;
        this.tamano = 0;
    }
    
    private boolean estaVacia() {
        //return (tamano==0);
        return (p==null&&u==null);
    }

    public Nodo obtenerNodoxPosicion(int posi) {
        Nodo nodoAux = null;        
        
        if(posi>=0 && posi<tamano) {
            nodoAux = p;
            if(posi>0) {
                for (int i = 1; i<=posi; i++) {
                    nodoAux = nodoAux.sgte;
                }                
            }
        }
        
        return nodoAux;
    }
	
    private void insertarNodoxPosicion(Nodo nodo, int posi) {
        if(estaVacia()) {
            p = nodo;
            u = p;
            tamano += 1;
        }
        else if(posi>=0 && posi<= tamano) {
            if(posi==0) { //un nuevo 1ero
                nodo.sgte = p;
                p = nodo;
                tamano += 1;
            }
            else if(posi==tamano) { //un nuevo ultimo
                u.sgte = nodo;
                u = nodo;
                tamano += 1;
            }
            else { //insertar entre 2 nodos
                Nodo nodoAuxAnterior = obtenerNodoxPosicion(posi-1);
                nodo.sgte = nodoAuxAnterior.sgte;
                nodoAuxAnterior.sgte = nodo;
                tamano += 1;
            }
        }            
    }

    public void insertarPrimero(Nodo nodo) {
        insertarNodoxPosicion(nodo, 0);
    }
    
    public void adicionar(Nodo nodo) {
        insertarNodoxPosicion(nodo, tamano);
        u = nodo;
    }
    
    public void removerPrimerNodo() {
        if(!estaVacia()) {
            if(tamano > 1) { //si hay mas de 1 nodo
                Nodo nodoAux = p.sgte;
                p.sgte = null;
                p = nodoAux;                
            }
            else  { //solo hay 1 nodo
                p = null;
                u = null;                
            }
            tamano -= 1;
        }        
    }
	
    public Nodo obtenerPrimero() {
        return (obtenerNodoxPosicion(0));        
    }
    
    public Nodo obteneryRemoverPrimero() {        
        Nodo nodoCopia = null;
        Nodo nodoAux = null;
        
        if(!estaVacia()) {
            nodoAux = obtenerPrimero();
            nodoCopia = new Nodo(nodoAux.dato);
            removerPrimerNodo();            
        }
        
        return nodoCopia;        
    }
    
    public void recorrerLista() {
        Nodo nodoAux = null;

        if(!estaVacia()) {
            nodoAux = p;
            while(nodoAux!=null) {
                System.out.println(nodoAux.dato);
                nodoAux = nodoAux.sgte;
            }
        }
    }
}

package principal;

import base.MiLista;
import base.Nodo;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        pruebaMiLista();
    }
    
    private static void pruebaMiLista() {
        MiLista lista = new MiLista();
        
//        lista.insertarNodoxPosicion(new Nodo(8), 0);
//        lista.insertarNodoxPosicion(new Nodo(2), 1);
//        lista.insertarNodoxPosicion(new Nodo(6), 2);
        lista.adicionar(new Nodo(8));
        lista.adicionar(new Nodo(2));
        lista.adicionar(new Nodo(6));
        
        lista.obteneryRemoverPrimero();
        //System.out.println(nodoAux.dato);        
        lista.recorrerLista();
    }
}

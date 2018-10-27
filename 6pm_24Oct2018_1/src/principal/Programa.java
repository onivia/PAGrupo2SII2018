package principal;

import base.Cola;
import base.MiLista;
import base.Nodo;
import base.Pila;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        //pruebaMiLista();
        //pruebaCola();
        pruebaPila();
    }
    
    private static void pruebaMiLista() {
        MiLista lista = new MiLista();
        
//        lista.insertarNodoxPosicion(new Nodo(8), 0);
//        lista.insertarNodoxPosicion(new Nodo(2), 1);
//        lista.insertarNodoxPosicion(new Nodo(6), 2);
//        lista.adicionar(new Nodo(8));
//        lista.adicionar(new Nodo(2));
//        lista.adicionar(new Nodo(6));
//        
//        lista.obteneryRemoverPrimero();
//        //System.out.println(nodoAux.dato);        
//        lista.recorrerLista();
    }
    
    private static void pruebaCola() {
        Cola cola = new Cola();
        cola.encolar(new Nodo(8));
        cola.encolar(new Nodo(2));
        cola.encolar(new Nodo(4));
        
        cola.desencolar();
        cola.desencolar();
        System.out.println(cola.obtener().dato);
    }
    
    private static void pruebaPila() {
        Pila pila = new Pila();
        pila.apilar(new Nodo(4));
        pila.apilar(new Nodo(2));
        pila.apilar(new Nodo(8));
        
        pila.desapilar();
        pila.desapilar();
        System.out.println(pila.obtener().dato);
    }
}

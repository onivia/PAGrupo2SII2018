package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        //pruebaList();
        //pruebaSet();
        pruebaMap();
    }
    
    private static void pruebaList() {
        List<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante(100, "Jonatan100", "A"));
        estudiantes.add(new Estudiante(200, "Jonatan200", "B"));
                    
        System.out.println(estudiantes.contains(new Estudiante(200, "Jonatan200", "B")));
        System.out.println(estudiantes.indexOf(new Estudiante(300, "Jonatan200", "B")));
        
        estudiantes.remove(new Estudiante(300, "Jonatan200", "B"));
        
        
//        for(Estudiante e : estudiantes) {
//            System.out.println(e);            
//        }
    }
    
    private static void pruebaSet() {
        Set<Estudiante> estudiantes = new HashSet<>();
        
        estudiantes.add(new Estudiante(100, "Jonatan100", "A", "1"));
        estudiantes.add(new Estudiante(200, "Jonatan200", "B", "2"));
        estudiantes.add(new Estudiante(200, "Jonatan200", "B", "3"));
        
        for(Estudiante e : estudiantes) {
            System.out.println(e);            
        }       
    }

    private static void pruebaMap() {
        Map<Integer,Estudiante> estudiantes = new HashMap<>();

        estudiantes.put(100, new Estudiante(100, "Jonatan100", "A", "1"));
        estudiantes.put(100, new Estudiante(200, "Jonatan200", "B", "2"));
        
        for(Map.Entry<Integer,Estudiante> m : estudiantes.entrySet()) {
            System.out.println("Key=" + m.getKey() + " value=" + m.getValue());            
        }
    }
}

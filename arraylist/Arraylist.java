package arraylist;
import java.util.*;
public class Arraylist {
    
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();

        lista.add(new Persona("Miguel", 21,00));
        lista.add(new Persona("Miguel", 21, 01));
        lista.add(new Persona("Miguel2", 22, 02));
        lista.add(new Persona("Miguel3", 23, 03));
        lista.add(new Persona("Miguel4", 24, 04));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba" + lista.get(i).getNombre());
            
        }
    }
}

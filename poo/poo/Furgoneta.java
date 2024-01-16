package poo;



public class Furgoneta extends Coche{
    
    // se da estado inicial a las caracteristicas extras de la Furgoneta
    private int Capacidad_carga;

    private int Numero_plazas;

    // Se crea el metodo constructor  para la furgoneta y se añaden las dos caracteristicas nuevas
    public Furgoneta(int Numero_plazas, int Capacidad_carga){

    //
        super();  //se llama al constructor padre de la clase (Coche)


        this.Capacidad_carga=Capacidad_carga;

        this.Numero_plazas=Numero_plazas;
        
        }

public int getCapacidad_carga() {
    return Capacidad_carga;
}
public int getNumero_plazas() {
    return Numero_plazas;
}


    
    }


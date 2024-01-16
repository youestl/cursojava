package logica;

public abstract class Pokemon {

    protected String nom_pokemon;
    protected int num_pokedex;
    protected double peso;
    protected String sexo;
    protected int temporada;

    //metodos de ataque

    protected abstract void atacarplacaje();

    protected abstract void atacaraaranazo(); 

    protected abstract void atacarmordisco();   

}

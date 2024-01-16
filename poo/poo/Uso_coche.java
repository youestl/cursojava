package poo;
import javax.swing.*;

public class Uso_coche {
    public static void main(String[] args) {

       /*  Coche CX5 = new Coche();
        // System.out.println(CX5.largo_coche());

        System.out.println(CX5.largo_coche());
        
        CX5.color_auto(JOptionPane.showInputDialog("Introduce el color de tu vehiculo"));
        System.out.println(CX5.imprime_color());

        CX5.configura_asiento(JOptionPane.showInputDialog("Deseas asientos de cuero?"));
        System.out.println(CX5.dime_asientos());//se imprime el getter

        CX5.configura_climatizador(JOptionPane.showInputDialog("Deseas agregar climatizador? Si/No"));
        System.out.println(CX5.dime_climatizador());//se imprime el getter

        System.out.println("el valor de tu vehiculo es : " + CX5.precio_coche());*/

        Coche Micoche1 = new Coche();

        Micoche1.color_auto("blanco");

        Furgoneta Furgoneta1 = new Furgoneta(7, 450);

        Furgoneta1.color_auto("rojo");
        Furgoneta1.configura_asiento("si");
        Furgoneta1.configura_climatizador("si");
        
        System.out.println (Furgoneta1.Dimedatosgenerles() + " Ademas " +  Furgoneta1.dime_asientos() + " y " +  Furgoneta1.dime_climatizador()) ;
        System.out.println ("Las caracteristicas generales de tu furgoneta son " + Furgoneta1.getCapacidad_carga() + " kilos de capacidad de carga" + 
        " y una capacidad de plazas de " + Furgoneta1.getNumero_plazas() + " plazas." );






    }

}
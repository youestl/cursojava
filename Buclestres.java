import java.util.*;
import javax.swing.*;

public class Buclestres{
     public static void main(String[] args) {
     
        String genero = "";

        do{
            genero=JOptionPane.showInputDialog("Ingresa tu genero (H/M)");

        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura"));
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu peso"));
        int pesoideal= 0 ;

        if(genero.equalsIgnoreCase("H")){

            pesoideal=altura-110;
            System.out.println("tu peso ideal es: " + pesoideal);

            }if (peso>pesoideal){
                System.out.println("estas pasado de tu peso");
            }else if (peso<pesoideal){
                System.out.println("estas bajo de peso");     
        
        
        }else if(genero.equalsIgnoreCase("M"));{
           pesoideal=altura-105;
            System.out.println("tu peso ideal es: " + pesoideal);

            }if (peso>pesoideal){
                System.out.println("estas pasado de tu peso");
            }else if (peso<pesoideal){
                System.out.println("estas bajo de peso");     
            }
                               
    }
}
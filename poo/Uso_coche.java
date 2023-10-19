package poo;

public class Uso_coche{
    public static void main(String[] args){

        Coche CX5 = new Coche();
      //para saber largo se cra un objeto del tipo coche y se utiliza el metodo Getter
      //System.out.println(CX5.largo_coche());  
       

        //A continuacion se utiliza el metodo Setter para establecer el color del auto
        CX5.color_auto("amarillo");
        System.out.println(CX5.imprime_color());

        CX5.tipo_asiento("si");
         System.out.println(CX5.dime_asientos());

        
    }

}
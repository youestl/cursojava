package poo;

public class Coche {
   private int ruedas;
   private int largo;
   private int ancho;
   private int motor;
   private int peso_plataforma;
   private String color;
   private int peso_total;
   private boolean Asientos_decuero, climatizador;

//metodo constructor
public Coche(){
   ruedas = 4;
   largo = 2000;
   ancho = 300;
   motor = 1600;
   peso_plataforma = 500;
      }
//metodo getter con su instruccion return por tantos iempre devuielve un valor a dif
//rencia del metodo Setters
public String largo_coche(){
   return "El largo de tu coche es " +  largo + " mm." ;
      }

//metodo setter aqui se declara la propiedad
public void color_auto(String establece_color) {
   color = establece_color;
}

public String imprime_color() {
   return "El color del coche es " + color;
}
   
//setter asientos cuero
public void tipo_asiento(String asiento_cuero){
if (asiento_cuero == "si"){
 Asientos_decuero= true;
}else{
   Asientos_decuero= false;
   }
}
//getter asientos cuero
public String dime_asientos(){
     if(Asientos_decuero=true){
      return "Tu coche tiene asientos de cuero";
     }else{
      return "Tu coche no posee asientos de cuero";
     }
   }



}
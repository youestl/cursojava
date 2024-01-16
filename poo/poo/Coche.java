package poo;

public class Coche { // public y private son modificadores de acceso
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

public String Dimedatosgenerles(){
   return "Tu Vehiculo tiene " + ruedas + " ruedas" + ", un largo de " + largo + " y un peso de " + peso_plataforma + " kg.";
}


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
public void configura_asiento(String Asientos_decuero){
   if (Asientos_decuero.equals("si")){
   this.Asientos_decuero= true;
   }else{
   this.Asientos_decuero= false;
   }
}
//getter asientos cuero
public String dime_asientos(){
   if(Asientos_decuero=true){
   return "Tu coche tiene asientos de cuero";
   }else{
   return "Tu coche no posee asientos de cuero";
   }
}//setter climatizador
public void configura_climatizador(String climatizador){
   if (climatizador.equals("si")){
   this.climatizador = true;
   }else{
   this.climatizador = false;
   }
}//getter climatizador
public String dime_climatizador(){
   if(climatizador=true){
   return "Tu coche tiene climatizador";
   }else{
   return "tu coche no posee climatizador";
   }  
   }
public int precio_coche(){

   int precio_final = 10000;

   if(Asientos_decuero== true){
      precio_final+=2000;
   }
   if(climatizador==true){
      precio_final+=1500;
   }
   return precio_final;
}


}

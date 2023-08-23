import javax.swing.*;

public class Uso_bucle_for {
        public static void main(String[] args){


            boolean arroba  =false;
            String correo = JOptionPane.showInputDialog("Ingresa tu correo");
            for(int i=0;i<correo.length();i++){
            
                if(correo.charAt(i)=='@'){ 
                    arroba=true;
                
            }
                           
                       
            }  if(arroba == true){
             System.out.println("tu correo " + correo + " es correcto");

            }   else{
            System.out.println("el correo ingresado " + correo + " es incorrecto");

            }



    }
}

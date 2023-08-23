import javax.swing.*;

public class Uso_bucle_for {
        public static void main(String[] args){


            int arroba  = 0;
            Boolean punto = false;
            String correo = JOptionPane.showInputDialog("Ingresa tu correo");
            for(int i=0;i<correo.length();i++){
            
                if(correo.charAt(i)=='@'){ 
                    arroba++;
                
            }
                if(correo.charAt(i)=='.'){ 
                    punto=true;
                
            }        
                       
            }  if(arroba == 1 && punto == true){
             System.out.println("tu correo " + correo + " es correcto");

            }   else {
            System.out.println("el correo ingresado " + correo + " es incorrecto");

            }

    }
}

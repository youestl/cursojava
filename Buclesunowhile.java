import javax.swing.*;

public class Buclesunowhile{
    public static void main(String[] args) {
        
        String clave = "Miguel";
        String pass = "";

        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contrasena por favor");
            if(clave.equals(pass)==false){
                System.out.println("Contrasena incorrecta");
            }
        }
        System.out.println("Contrasna correcta");
    }
}
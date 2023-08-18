import javax.swing.JOptionPane;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);  // se crea ub objeto de tipo Scanner llamado entrada, a continuacion se llama al
        // constructor con el operador new y a traves de System.in se utiliza la consola del sistema para almacenar el dato  en "entrada"
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");  //  \n1 se utiliza para escribir con salto de linea a partir de lo que se escriba despues.
        int entry = entrada.nextInt();
        	
        switch (entry){

        case 1: 
       
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el valor del lado del cuadrado"));
        System.out.println("el valor del area del cuadrado es " + Math.pow(lado, 2) + "unidades cuadradas");
        break;
        
        case 2:
            int base = Integer.parseInt(JOptionPane.showInputDialog("ingresa la base del rectangulo"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("ingresa la altura del rectangulo"));
            int resultado = base*altura;
        System.out.println("el valor de area del rectangulo es " + resultado);
          break;

        case 3:
            base = Integer.parseInt(JOptionPane.showInputDialog("ingresa la base del Triangulo"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("ingresa la altura del Triangulo"));
            resultado = base*altura/2;
         System.out.println("el valor de area del triangulo es " + resultado);
          break;           
            
        case 4:
            int radio = Integer.parseInt(JOptionPane.showInputDialog("ingresa el radio del Circulo"));
         System.out.println("El area del Circulo es " );
          System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
          break;         
        
        default:
            System.out.println("La opcion ingresada es incorrecta");

            
        }
    }
}
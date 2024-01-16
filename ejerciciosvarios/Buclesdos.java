import java.util.*;
// el programa genera un numero de 0 a 100 y debemos adivinarlo
public class Buclesdos {
    public static void main(String[] args) {
        int variable = (int)(Math.random()*100);
        //System.out.println(variable);
        

        int numero = 0;
        int intentos = 0;
        // mientras numero != sea diferente a variable
        while(numero!= variable){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un numero por favor");
            numero = entrada.nextInt();// numero debe ser igual a lo que se introduzca en consola
            if(numero > variable){
            System.out.println("Mas abajo");
            intentos++;
            }
                else if(numero < variable){
                System.out.println("Mas arriba");
                 intentos++;
                }
        }
        System.out.println("haz acertado con " + intentos + " intentos");
    }
}
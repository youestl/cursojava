package poo;
import java.util.*;
import javax.swing.*;


public class Uso_empleados {
    public static void main(String[] args) {

        
        
        /*Empleado empleado1= new Empleado("Miguel Ahumada",67999,2018,2,3);
        empleado1.Subesueldo(5);

        Empleado empleado2= new Empleado("Carla R",78199,2012,5,3);
        empleado1.Subesueldo(5);

        Empleado empleado3= new Empleado("Aika2",50000,2021,5,28);
        empleado1.Subesueldo(5);

        System.out.println("Nombre: " + empleado1.Dime_nombre() + " Sueldo: " + empleado1.Dime_sueldos() +
        " Fecha Contrato: " + empleado1.Damefechacontrato());

        System.out.println("Nombre: " + empleado2.Dime_nombre() + " Sueldo: " + empleado2.Dime_sueldos() +
        " Fecha Contrato: " + empleado2.Damefechacontrato());
 
        System.out.println("Nombre: " + empleado3.Dime_nombre() + " Sueldo: " + empleado3.Dime_sueldos() +
        " Fecha Contrato: " + empleado3.Damefechacontrato());*/
 

        Empleado [] misempleados = new Empleado[3];

        misempleados[0] = new Empleado("Miguel " , 56444, 2018, 3, 30);
        misempleados[1] = new Empleado("carla Roj ", 632999, 2108,2,3);
        misempleados[2] = new Empleado("Aika " , 632929, 2011,2,3);

        /*for(int i=0;i<3;i++){
            misempleados[i].Subesueldo(5);
        }

        
        for(int i=0;i<3;i++){
            System.out.println("Nombre " + misempleados[i].Dime_nombre() + " Sueldo :" + misempleados[i].Dime_sueldos()
            + " Fecha contrato " + misempleados[i].Damefechacontrato() );
        }*/

        for(Empleado e : misempleados){
            e.Subesueldo(5);

            System.out.println("Nombre " + e.Dime_nombre() + " Sueldo :" + e.Dime_sueldos()
            + " Fecha contrato " + e.Damefechacontrato() );


        }
    }
}


class Empleado{// cuando se utiliza solo un fichero para las clases solo puede haber una del 
    //tipo publica y solo un metodo main
    //tiene el modificador de acceso public para permitir acceder a sus datos
    public Empleado(String nom, double sue, int ano, int mes, int dia){
    
    nombre=nom;
    sueldo=sue;
    GregorianCalendar calendario= new GregorianCalendar(ano, mes, dia);
    alta_contrato = calendario.getTime();

    }

        /*  public void Establece_nombre(String nombre_empleado){
        for(int i=0;i<3;i++){
        misempleados[]
    }
    }*/
    public String Dime_nombre(){//getter
        return nombre;
    }

    public double Dime_sueldos(){ //getter
        return sueldo;

    }
    public Date Damefechacontrato(){//getter
        return alta_contrato;
        
    }   
// se establece un metodo para incrementar sueldo del trabajador
// atraves de un metodo setter

    public void Subesueldo(double porcentaje){

        
        double aumento= sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    private String nombre;
    private double sueldo;
    private Date alta_contrato;
    
}
    



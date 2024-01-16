package poo;
import java.util.*;
import javax.swing.*;




public class Uso_empleados {
    public static void main(String[] args) {


        Jefatura jefe_01 = new Jefatura("Miguel", 23000, 1990, 11, 24);

        
        jefe_01.Establece_incentivo(23000);

        
        Empleado [] misempleados = new Empleado[4];

        misempleados[0] = new Empleado("Miguel " , 56444, 2018, 3, 30);
        misempleados[1] = new Empleado("carla Roj ", 632999, 2108,2,3);
        misempleados[2] = new Empleado("Aika " , 632929, 2011,2,3);
        misempleados[3] = jefe_01;



        for(Empleado e : misempleados){
            e.Subesueldo(5);

            System.out.println("Nombre " + e.Dime_nombre() + " Sueldo :" + e.Dime_sueldos()
            + " Fecha contrato " + e.Damefechacontrato() );


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

    //Subclase JEFATURA
    class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int ano, int mes, int dia){

    super(nom, sue, ano,mes,dia);

    
    }
    public void Establece_incentivo(double b){

    Incentivo = b;

    }

    public double Dime_sueldos(){
    
    double SueldoJefe= super.Dime_sueldos();    //el metodo Dime Sueldo reemplaza al metodo Dime sueldo de la clase empleado pero
    return Incentivo + SueldoJefe;              //al utilizar super se adquieren las caracteristicas del metodo de la clase padre

    }
    public double Incentivo;

        }
}


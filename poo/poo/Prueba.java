package poo;


import javax.swing.JOptionPane;

// uso de constantes FINAL
public class Prueba {

        public static void main(String[] args) {

        Empleados trabajador_uno = new Empleados(JOptionPane.showInputDialog("Ingresa el nombre del trabajador"));
        
        System.out.println(trabajador_uno.devuelvetrabajador()); 

        Empleados trabajador_dos = new Empleados(JOptionPane.showInputDialog("Ingresa el nombre del trabajador"));
        
        System.out.println(trabajador_dos.devuelvetrabajador());     
 
        Empleados trabajador_tres = new Empleados(JOptionPane.showInputDialog("Ingresa el nombre del trabajador"));
        
        System.out.println(trabajador_tres.devuelvetrabajador());
        
        
        /*for (int i=0, J=0;i<J;i++){
        int numero_empleados= 0;

        J= numero_empleados;

        Empleados[] todosempleados =new Empleados[J];

        todosempleados[i] =new Empleados(null);
        

        }*/

}

}

class Empleados{

        public Empleados(String nom){
                //numero_empleados =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de trabajadores"));
                nombre=nom;
                seccion = JOptionPane.showInputDialog("Ingresa la seccion del trbajador");
                Id=IdSiguiente;
                IdSiguiente++;

        }

        public void ingresa_nombre(String nombretrabajador){

                nombre=nombretrabajador;
        }


        public void Cambiaseccion( String seccion){

                this.seccion=seccion;
        }

        public String devuelvetrabajador(){


                return "El trabajador " + nombre + " pertenece a la siguiente sección: " + seccion
                + " ID : " + Id;       
                
                
        }

        //private int numero_empleados;
        private String nombre;
        private String seccion;
        private int Id;
        public static int IdSiguiente =1;

}

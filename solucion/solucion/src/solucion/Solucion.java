/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALA I
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
    entrada.useLocale(Locale.US);
   
    String nombre;
    String cadena = "";
    String opcion = "";
    String ciudad = "";
    int cedula;
    int horasMatutinas;
    int horasNocturnas;
    int contador = 0;
    double total_Mat;
    double total_Noc = 0;
    double seguro = 18;
    double valor_Matutina = 10;
    double valor_Nocturno = 15;
    double valor_Cancelar = 0;
    double subtotal;
    double total;
    double adicional = 0;
    boolean bandera = true;
    
    while (bandera){
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la cedula del empleado");
        cedula = entrada.nextInt();
        
        System.out.println("Ingrese las horas matutinas trabajadas");
        horasMatutinas = entrada.nextInt();
        
        System.out.println("Ingrese las horas nocturnas trabajadas");
        horasNocturnas = entrada.nextInt();
        
        System.out.println("Ingrese la ciudad de la empresa");
        nombre = entrada.nextLine();
        
        entrada.nextLine();
        
        total_Mat = horasMatutinas * valor_Matutina; 
       
       if (horasNocturnas >= 10){
           adicional = valor_Nocturno * 0.10;
           valor_Nocturno = valor_Nocturno + seguro;
        }
       
       total_Noc = valor_Nocturno + adicional;
       valor_Nocturno = 15;
      
       subtotal = total_Noc + total_Mat;
       
       seguro = (subtotal * seguro) / 100;
       total = subtotal -seguro;
       
       cadena = String.format("%sRol de trabajadores de nombre %s"
               + " la cedula es: %d\n"
               + " Las horas matutinas trabajadas son: %s\n"
               + " las horas nocturnas trabajadas son %s\n"
               + " La cidad de la empresa es: %s\n"
               + " Subtotal: %.2f\n"
               + "Seguro Social: %.2f\n"
               + "Total a cancelar: %.2f\n", cadena,nombre,cedula,horasMatutinas,
               horasNocturnas,ciudad,subtotal,seguro,total);
       contador = contador + 1;
       System.out.println("Si desea salir presione la tecla s");
       opcion = entrada.nextLine();
       
       if ("s".equals(opcion)){
           bandera = false;
       }
               
    }
    System.out.println(cadena);
    
    }
    
}

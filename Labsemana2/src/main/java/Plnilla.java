
import java.util.Scanner;

/**
 *
 * @author Mayra Bardales
 */
public class Plnilla {
    public static void main(String[] args){
        
       String nombreempleado;
       double horastrabajomensual;
       double tarifahora;
       

        Scanner data =new Scanner(System.in);
        
        System.out.println("Nombre de empleado:");
        nombreempleado = data.nextLine();
        
        System.out.println("Hora de Trabajo Mnesual");
        horastrabajomensual= data.nextDouble();
        
        System.out.println("Tarifa por Hora");
        tarifahora= data.nextDouble();
         
        
        double salariosemanal= horastrabajomensual * tarifahora;
        
        System.out.println("---Boleta de Empleado---");
        System.out.println("Nombre de Empleado: " +nombreempleado);
        System.out.println("Hora de trabajo Mensual: " +horastrabajomensual);
        System.out.println("Tarifa por hora:" +tarifahora);
        System.out.println("Salario de Empleado Semanal:" +salariosemanal);
        
        
        
         
        
        
    }
    

    
}

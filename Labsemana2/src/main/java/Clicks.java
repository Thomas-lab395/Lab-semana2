
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Clicks {
        
     public static void main(String[] args) {
        double costo, Clics, costomedio, inputpain;
        Scanner entradaDatos = new Scanner(System.in);
        
        System.out.print("****Calculando costos de clicks**** \nIngrese la cantidad de clics: ");
        Clics = entradaDatos.nextDouble();
        

            if (Clics > 0 || Clics <21 ){ costo = 0.80;}
            else {if (Clics > 20 || Clics < 61){ costo = 0.30;} 
            else {if (Clics > 60){costo = 0.25;} 
            else {costo = 0;}}}
            
            //Calculo de Precio
            costomedio = (Clics * costo);
            inputpain = costomedio * 0.16;
            costomedio = inputpain + costomedio;
               
        String costoPromedioForm = String.format("%.2f", costomedio);
        System.out.print("El costo promedio de sus click son: " + costoPromedioForm + "\nCantidad de clics: " + Clics + "\n");
        
        
        }
}

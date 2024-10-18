
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    public class Formulas {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio a: (3/2) + (4/3)
        System.out.println("Ejercicio a:");
        double resultadoA = (3.0 / 2) + (4.0 / 3);
        System.out.println("El resultado de (3/2) + (4/3) es: " + resultadoA);

        // Ejercicio b: (1/(x - 5)) - (3xy/4)
        System.out.println("\nEjercicio b:");
        System.out.print("Ingresa el valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa el valor de y: ");
        double y = sc.nextDouble();
        double resultadoB = (1 / (x - 5)) - (3 * x * y / 4);
        System.out.println("El resultado de (1/(x - 5)) - (3xy/4) es: " + resultadoB);

        // Ejercicio c: (1/2) + 7
        System.out.println("\nEjercicio c:");
        double resultadoC = (1.0 / 2) + 7;
        System.out.println("El resultado de (1/2) + 7 es: " + resultadoC);

        // Ejercicio d: 7 + (1/2)
        System.out.println("\nEjercicio d:");
        double resultadoD = 7 + (1.0 / 2);
        System.out.println("El resultado de 7 + (1/2) es: " + resultadoD);

        // Ejercicio e: (a^2)/(b-c) + (d-e)/(f-g*h/j)
        System.out.println("\nEjercicio e:");
        System.out.print("Ingresa el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Ingresa el valor de c: ");
        double c = sc.nextDouble();
        System.out.print("Ingresa el valor de d: ");
        double d = sc.nextDouble();
        System.out.print("Ingresa el valor de e: ");
        double e = sc.nextDouble();
        System.out.print("Ingresa el valor de f: ");
        double f = sc.nextDouble();
        System.out.print("Ingresa el valor de g: ");
        double g = sc.nextDouble();
        System.out.print("Ingresa el valor de h: ");
        double h = sc.nextDouble();
        System.out.print("Ingresa el valor de j: ");
        double j = sc.nextDouble();

        // Calcular a^2 manualmente
        double aCuadrado = a * a;
        double resultadoE = (aCuadrado / (b - c)) + ((d - e) / (f - (g * h / j)));
        System.out.println("El resultado de (a^2)/(b-c) + (d-e)/(f-g*h/j) es: " + resultadoE);

        // Ejercicio f: (m/n) + p
        System.out.println("\nEjercicio f:");
        System.out.print("Ingresa el valor de m: ");
        double m = sc.nextDouble();
        System.out.print("Ingresa el valor de n: ");
        double n = sc.nextDouble();
        System.out.print("Ingresa el valor de p: ");
        double p = sc.nextDouble();
        double resultadoF = (m / n) + p;
        System.out.println("El resultado de (m/n) + p es: " + resultadoF);

        // Ejercicio g: (m + n)/(p - q)
        System.out.println("\nEjercicio g:");
        System.out.print("Ingresa el valor de p: ");
        double q = sc.nextDouble(); // Cambiamos el valor de q
        double resultadoG = (m + n) / (p - q);
        System.out.println("El resultado de (m + n)/(p - q) es: " + resultadoG);

        // Ejercicio h: (a^2/b^2) + (c^2/d^2)
        System.out.println("\nEjercicio h:");
        // Calcular a^2, b^2, c^2 y d^2 manualmente
        double bCuadrado = b * b;
        double cCuadrado = c * c;
        double dCuadrado = d * d;
        double resultadoH = (aCuadrado / bCuadrado) + (cCuadrado / dCuadrado);
        System.out.println("El resultado de (a^2/b^2) + (c^2/d^2) es: " + resultadoH);

        // Ejercicio i: (m + (n/p))/(q - (r/s))
        System.out.println("\nEjercicio i:");
        System.out.print("Ingresa el valor de q: ");
        double q2 = sc.nextDouble();
        System.out.print("Ingresa el valor de r: ");
        double r = sc.nextDouble();
        System.out.print("Ingresa el valor de s: ");
        double s = sc.nextDouble();
        double resultadoI = (m + (n / p)) / (q2 - (r / s));
        System.out.println("El resultado de (m + (n/p))/(q - (r/s)) es: " + resultadoI);

        // Ejercicio j: ((3a + b)/(c - (d + 5e)))/((f + g)/(2h))
        System.out.println("\nEjercicio j:");
        System.out.print("Ingresa el valor de e: ");
        double e2 = sc.nextDouble();
        double resultadoJ = ((3 * a + b) / (c - (d + 5 * e2))) / ((f + g) / (2 * h));
        System.out.println("El resultado de ((3a + b)/(c - (d + 5e)))/((f + g)/(2h)) es: " + resultadoJ);

        // Ejercicio k: (a^2 + 2ab + b^2)/(1/(x^2 + 2))
        System.out.println("\nEjercicio k:");
        // Calcular a^2 y b^2 manualmente
        double resultadoK = (aCuadrado + 2 * a * b + b * b) / (1 / (x * x + 2));
        System.out.println("El resultado de (a^2 + 2ab + b^2)/(1/(x^2 + 2)) es: " + resultadoK);

       
    }
}
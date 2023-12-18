/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S011_10;

/**
 *
 * @author deyto
 */
public class Calculadora_10 {
    // Método para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No es posible dividir por cero.");
            return Double.NaN; // NaN (Not a Number) representa un resultado indefinido
        }
    }
}

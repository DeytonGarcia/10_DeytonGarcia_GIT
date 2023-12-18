/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S012_10;

import S011_10.*;
import S09_10.*;

/**
 *
 * @author deyto
 */
public class Main_S09_10 {
    public static void main(String[] args) {
                // Crear instancias de la clase Estudiante_10
        Estudiante_10 estudiante1 = new Estudiante_10("Juan", 20, "Matemáticas", 85.5);
        Estudiante_10 estudiante2 = new Estudiante_10("María", 22, "Historia", 92.0);

        // Imprimir información de los estudiantes
        System.out.println("Información del Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Curso: " + estudiante1.getCurso());
        System.out.println("Calificación: " + estudiante1.getCalificacion());
        System.out.println();

        System.out.println("Información del Estudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Curso: " + estudiante2.getCurso());
        System.out.println("Calificación: " + estudiante2.getCalificacion());
  
        // Utilizar la clase Calculadora

        // Ejemplo de suma
        double resultadoSuma = S011_10.Calculadora_10.sumar(10, 5);
        System.out.println("Suma: " + resultadoSuma);

        // Ejemplo de resta
        double resultadoResta = S011_10.Calculadora_10.restar(10, 5);
        System.out.println("Resta: " + resultadoResta);

        // Ejemplo de multiplicación
        double resultadoMultiplicacion = S011_10.Calculadora_10.multiplicar(10, 5);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        // Ejemplo de división
        double resultadoDivision = S011_10.Calculadora_10.dividir(10, 5);
        System.out.println("División: " + resultadoDivision);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S012_10;

import S011_10.*;

/**
 *
 * @author deyto
 */
public class Estudiante_10 {
    private String nombre;
    private int edad;
    private String curso;
    private double calificacion;

    public Estudiante_10(String nombre, int edad, String curso, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

}


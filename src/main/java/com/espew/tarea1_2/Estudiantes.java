/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.tarea1_2;

/**
 *
 * @author USUARIO
 */
public class Estudiantes extends Persona {
    public int Nivel;
    public String Carrera;
    //constructor
    public Estudiantes(String Nombre, int Edad, String Email, int Nivel, String Carrera) {
        super(Nombre,Edad,Email);
        this.Nivel = Nivel;
        this.Carrera = Carrera;
    }
    @Override
    public String toString(){
        return "Estudiante (Name: " + Nombre + "; Email: " + Email + "; Edad: " + Edad + "; nivel: " + Nivel + "; carrera: '" + Carrera + "' }";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.tarea1_2;

/**
 *
 * @author USUARIO
 */
public abstract class Persona {
    protected String Nombre;
    protected int Edad;
    protected String Email;

    //constructor
    public Persona(String Nombre, int Edad, String Email) {
        this.Nombre = Nombre;
        this.Edad =(Edad>=0) ?  Edad:-1 ;
        this.Email = (Email==null) ? "email no proporcionado" : Email;
    }
    
    
    
}

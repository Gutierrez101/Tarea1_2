/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espew.tarea1_2;
/**
 *
 * @author USUARIO
 */
public class Tarea1_2 {

    public static void main(String[] args) {
       Estudiantes est1=new Estudiantes("Juan", 16, null, 1, "Software");
       Estudiantes est2=new Estudiantes("Martha", 19, "martha@espe.edu.ec", 5, "Mecánica");
       Estudiantes est3=new Estudiantes("Carlos", 17, null, 3, "Electrónica");
       Estudiantes est4=new Estudiantes("Patricia", 20, "patty@espe.edu.ec", 8, "Petroquímica");
       
       System.out.println(est1);
       System.out.println(est2);
       System.out.println(est3);
       System.out.println(est4);
    }
}

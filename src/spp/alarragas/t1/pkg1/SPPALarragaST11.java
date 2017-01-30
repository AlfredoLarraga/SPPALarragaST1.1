/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.alarragas.t1.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPALarragaST11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alfredo Alejandro Lárraga Sosa A01410278 LMC
        //Problema 1 Desarrollar un programa que pida matrícula y calificaciones dando el promedio del alumno
        System.out.println("Promedio del alumno");
        //Declarar Variables
        double mat,cal1, cal2, cal3, cal4, cal5, rep, pro;// matricula, calificaciones 1,2,3,4 y 5, aprobado/reprobado, promedio
        //Recepción de datos
        Scanner kb=new Scanner (System.in);
        
        //Asignar Valores
        System.out.println("Introduce tu matrícula");
        mat=kb.nextDouble();
        System.out.println("Introduce tu calificación 1");
        cal1=kb.nextDouble();
        System.out.println("Introduce tu calificación 2");
        cal2=kb.nextDouble();
        System.out.println("Introduce tu calificación 3");
        cal3=kb.nextDouble();
        System.out.println("Introduce tu calificación 4");
        cal4=kb.nextDouble();
        System.out.println("Introduce tu calficación 5");
        cal5=kb.nextDouble();
        
        //Operación
        pro= ((cal1+cal2+cal3+cal4+cal5)/5);
        
        //Clasificar 
        
         //Muestro resultado
        System.out.println("Tu matrícula es" + mat);
        System.out.println("Tu promedio es"+pro);
        
        if (pro>=7.0){
            System.out.println("¡Lo Lograste!¡Estas aprobado!");
        } else if (pro<7.0){
            System.out.println("Que Dios te ayude, estas reprobado.");
        }
        
       
    }
    
}

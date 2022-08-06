/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

import com.mycompany.semana2.Clases;
import java.util.Scanner;

/**
 *
 * @author Emily Barrientos
 */
public class Inicio {
        private static Scanner teclado = new Scanner (System.in);
    
    public static void main(String[] args) {
            Clases al = new Clases();
            String palabra;
            System.out.println("Ingrese el texto a codificar: ");
            palabra= teclado.nextLine();
            System.out.println(al.Codificar(palabra, 3));
            System.out.println("Ingrese el codigo para descodificar: ");
            palabra= teclado.nextLine();
            System.out.println(al.Decodificar(palabra, 3));
            
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana2;


/**
 *
 * @author Emily Barrientos
 */
public class Clases {
   
    
    public String Codificar(String palabra, int llave){
        int codificar=0;
        String resultado = "";
        String peque="";
        
        for(int x=0; x<palabra.length(); x++){
            codificar= (int) palabra.charAt(x);
            codificar= codificar + llave;
            char caracter = (char) codificar;
            resultado= resultado + caracter;
        }
        
        //PASAR A MINUSCULAS
        peque = resultado.toLowerCase();
        return "El mensaje "+ palabra + " esta codificado y pasado a minuscula: "+ peque;
    }  
    
    public String Decodificar (String palabra, int llave){
        int codificar = 0;
        String resultado="";
        
        for (int y=0; y< palabra.length(); y++)
        {
            codificar = (int) palabra.charAt(y);
            codificar = codificar - llave;
            char caracter = (char) codificar;
            resultado = resultado + caracter;
        }
        
        return "El codigo "+ palabra + " descodificado es: " + resultado;
    }
}

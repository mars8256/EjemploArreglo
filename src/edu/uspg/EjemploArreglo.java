/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author morozco
 */
public class EjemploArreglo {
    
    Persona[] arreglo = new Persona[3];
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        EjemploArreglo arreglo = new EjemploArreglo();
        
        arreglo.menu();
    }
    
    public void menu(){
       
       boolean salir = false;
       int opcion;
       
       while(!salir){
           System.out.println("1. ingresar ");
           System.out.println("2. print ");
           System.out.println("3. find ");
           System.out.println("4. delete ");
           System.out.println("5. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = in.nextInt();
           switch(opcion){
               case 1:
                   ingresar();
                   break;
               case 2:
                   print();
                   break;
                case 3:
                   buscar();
                   break;
                case 4:
                   delete();
                   break;
                case 5:
                    salir=true;
                    break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
       }
    }
    
    public void ingresar(){
        Persona persona = new Persona();
        System.out.println("Ingresar dpi");
        persona.setDpi(in.nextInt());
        System.out.println("Ingrese nombre");
        persona.setNombre(in.next());
        System.out.println("Ingres apellido");
        persona.setApellido(in.next());
        System.out.println("Fecha");
        persona.setFecha(in.next());
        
        
        arreglo[0] = persona;
        
    }
    
    public void print(){
        for(int i = 0; i< arreglo.length-1; i++){
            if(arreglo[i] != null){
                arreglo[i].print();
            }
        }
        System.out.println("");
    }
    
    public void buscar(){
        int dpi;
        System.out.println("Ingrese dpi");
        dpi = in.nextInt();
        for(int i = 0; i< arreglo.length; i++){
            if(arreglo[i] != null){
                if(dpi == arreglo[i].getDpi()){
                arreglo[i].print();
                }else{
                    System.out.println("no se encontro el elemento");
                }
            }
            
        }
        
    }
    
    public void delete(){
        int dpi;
        System.out.println("Ingrese dpi a eliminar");
        dpi = in.nextInt();
        for(int i = 0; i< arreglo.length; i++){
            if(arreglo[i] != null){
                if(dpi == arreglo[i].getDpi()){
                    arreglo[i] = null;
                    System.out.println("se elimino el dpi " + dpi);
                }else{
                    System.out.println("no se encontro el elemento");
                }
            }
            
        }
    }
}

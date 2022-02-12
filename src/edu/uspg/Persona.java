/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

/**
 *
 * @author morozco
 */
public class Persona {
    int dpi;
    String nombre;
    String apellido;
    String fecha;
    
    public Persona(int dpi, String nombre, String apellido, String fecha){
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public Persona(){}
    
    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    public void print(){
        System.out.print("\t" + this.dpi);
        System.out.print("\t" + this.nombre);
        System.out.print("\t" + this.apellido);
        System.out.print("\t" + this.fecha);
    }
}

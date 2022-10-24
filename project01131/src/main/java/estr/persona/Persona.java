/*
 * C
lick nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.persona;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Persona implements Serializable{
    protected int id;
    protected String nombre;
    public Persona(){
        
    }

    public Persona(int id, String nombre) {
        this.id = id;        
        this.nombre = nombre;
    }

    public int getCi() {
        return id;
    }

    public void setCi(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar(){
        System.out.printf("ID: %d, nombre: %s, edad: %d ", id,nombre);
    }
}


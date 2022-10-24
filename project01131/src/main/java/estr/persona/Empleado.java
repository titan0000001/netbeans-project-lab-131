/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.persona;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */

public class Empleado implements Serializable  {
	private int ci;
    private String nombre, cargo;
    private float sueldo;
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(int ci, String nombre, String cargo, float sueldo) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public void mostrar(){
		
		System.out.println(" |Empleado| "+getNombre()+"-"+getCi()+"-"+getCargo()+"-"+getSueldo());    }
    
    
}


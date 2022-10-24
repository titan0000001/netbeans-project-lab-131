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
public class NodoEmpleado implements Serializable {
 private NodoEmpleado sig;
	private Empleado dato;
	
	public NodoEmpleado() {
		this.sig = null;
		this.dato = null;
	}
	public NodoEmpleado(Empleado dato) {
		this.sig = null;
		this.dato = dato;
	}
	public NodoEmpleado getSig() {
		return sig;
	}

	public void setSig(NodoEmpleado sig) {
		this.sig = sig;
	}

	public Empleado getDato() {
		return dato;
	}

	public void setDato(Empleado dato) {
		this.dato = dato;
	}   
}

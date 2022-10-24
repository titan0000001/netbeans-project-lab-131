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
public class NodoPaciente implements Serializable  {
    private NodoPaciente sig;
	private Paciente dato;
	
	public NodoPaciente() {
		this.sig = null;
		this.dato = null;
	}
	public NodoPaciente(Paciente dato) {
		this.sig = null;
		this.dato = dato;
	}
	public NodoPaciente getSig() {
		return sig;
	}

	public void setSig(NodoPaciente sig) {
		this.sig = sig;
	}

	public Paciente getDato() {
		return dato;
	}

	public void setDato(Paciente dato) {
		this.dato = dato;
	}
}

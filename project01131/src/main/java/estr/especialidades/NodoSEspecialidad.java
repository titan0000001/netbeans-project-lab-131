/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.especialidades;

import estr.persona.NodoS;
import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class NodoSEspecialidad implements Serializable {
    private NodoSEspecialidad sig;
	private Especialidad dato;
	
	public NodoSEspecialidad() {
		this.sig = null;
		this.dato = null;
	}
	public NodoSEspecialidad(Especialidad dato) {
		this.sig = null;
		this.dato = dato;
	}
	public NodoSEspecialidad getSig() {
		return sig;
	}

	public void setSig(NodoSEspecialidad sig) {
		this.sig = sig;
	}

	public Especialidad getDato() {
		return dato;
	}

	public void setDato(Especialidad dato) {
		this.dato = dato;
	}
}

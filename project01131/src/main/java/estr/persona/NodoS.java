/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.persona;

/**
 *
 * @author USUARIO
 */

public class NodoS {
	private NodoS sig;
	private Object dato;
	
	public NodoS() {
		this.sig = null;
		this.dato = null;
	}
	public NodoS(Object dato) {
		this.sig = null;
		this.dato = dato;
	}
	public NodoS getSig() {
		return sig;
	}

	public void setSig(NodoS sig) {
		this.sig = sig;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}
	
	
	
}


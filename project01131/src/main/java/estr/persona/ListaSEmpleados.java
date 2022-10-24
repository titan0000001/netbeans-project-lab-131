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
public class ListaSEmpleados  implements Serializable {
    	private NodoEmpleado p;		
	public ListaSEmpleados(){
		p = null;
	}
	NodoEmpleado getP() { return p;}
	void setP(NodoEmpleado q) { this.p=q;}
	boolean esvacia() {	return p==null; }
	int nroNodos() {
		int c =0;
		NodoEmpleado w =getP();	
		while (w != null) {
			c+=1;
			w = w.getSig();
		}
		return c;
	}
	public void adicionarPrincipio(Empleado l) {
		NodoEmpleado nue = new NodoEmpleado();
		nue.setDato(l);
		if (getP()==null) {
			setP(nue);			
		}else {
			nue.setSig(getP());				
			setP(nue);
		}			
	}
	public void adicionarFinal(Empleado x){
		NodoEmpleado nue=new NodoEmpleado();
		nue.setDato(x);		
		if(getP()==null) {
			setP(nue);
		}else{
			NodoEmpleado w=getP();
			while(w.getSig()!=null) {
				w=w.getSig();
			}
			w.setSig(nue);				
		}
	}
	public NodoEmpleado eliminarPrincipio() {
		NodoEmpleado q =getP();
		if (nroNodos()==1) {			
			setP(null);
		}else {			
			setP(q.getSig());
			q.setSig(null);
		}
		return q;		
	}		
	
	public NodoEmpleado eliminarFinal() {
		NodoEmpleado q =getP();
		NodoEmpleado x = new NodoEmpleado();
		if (nroNodos()==1) {			
			setP(null);
		}else {
			while (q.getSig().getSig()!=null) {
				q= q.getSig();
			}
			 x= q.getSig();
			 q.setSig(null);
		}
		return x;		
	}
	public void mostrar() {
		NodoEmpleado q =getP();
		while (q != null) {
			q.getDato().mostrar();
			q = q.getSig();
		}
		System.out.println();
	} 
}

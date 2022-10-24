/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.especialidades;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class ListaSEspecialidades  implements Serializable  {
    	private NodoSEspecialidad p;		
	public ListaSEspecialidades(){
		p = null;
	}
	NodoSEspecialidad getP() { return p;}
	void setP(NodoSEspecialidad q) { this.p=q;}
	boolean esvacia() {	return p==null; }
	int nroNodos() {
		int c =0;
		NodoSEspecialidad w =getP();	
		while (w != null) {
			c+=1;
			w = w.getSig();
		}
		return c;
	}
	void adicionarPrincipio(Especialidad l) {
		NodoSEspecialidad nue = new NodoSEspecialidad();
		nue.setDato(l);
		if (getP()==null) {
			setP(nue);			
		}else {
			nue.setSig(getP());				
			setP(nue);
		}			
	}
	public void adicionarFinal(Especialidad x){
		NodoSEspecialidad nue=new NodoSEspecialidad();
		nue.setDato(x);		
		if(getP()==null) {
			setP(nue);
		}else{
			NodoSEspecialidad w=getP();
			while(w.getSig()!=null) {
				w=w.getSig();
			}
			w.setSig(nue);				
		}
	}
	NodoSEspecialidad eliminarPrincipio() {
		NodoSEspecialidad q =getP();
		if (nroNodos()==1) {			
			setP(null);
		}else {			
			setP(q.getSig());
			q.setSig(null);
		}
		return q;		
	}		
	
	NodoSEspecialidad eliminarFinal() {
		NodoSEspecialidad q =getP();
		NodoSEspecialidad x = new NodoSEspecialidad();
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
		NodoSEspecialidad q =getP();
		while (q != null) {
			q.getDato().mostrar();
			q = q.getSig();
		}
		System.out.println();
	} 
}

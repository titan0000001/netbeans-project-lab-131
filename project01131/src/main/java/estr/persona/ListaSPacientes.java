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
public class ListaSPacientes  implements Serializable {
    	private NodoPaciente p;		
	public ListaSPacientes(){
		p = null;
	}
	NodoPaciente getP() { return p;}
	void setP(NodoPaciente q) { this.p=q;}
	boolean esvacia() {	return p==null; }
	int nroNodos() {
		int c =0;
		NodoPaciente w =getP();	
		while (w != null) {
			c+=1;
			w = w.getSig();
		}
		return c;
	}
	void adicionarPrincipio(Paciente l) {
		NodoPaciente nue = new NodoPaciente();
		nue.setDato(l);
		if (getP()==null) {
			setP(nue);			
		}else {
			nue.setSig(getP());				
			setP(nue);
		}			
	}
	public void adicionarFinal(Paciente x){
		NodoPaciente nue=new NodoPaciente();
		nue.setDato(x);		
		if(getP()==null) {
			setP(nue);
		}else{
			NodoPaciente w=getP();
			while(w.getSig()!=null) {
				w=w.getSig();
			}
			w.setSig(nue);				
		}
	}
	NodoPaciente eliminarPrincipio() {
		NodoPaciente q =getP();
		if (nroNodos()==1) {			
			setP(null);
		}else {			
			setP(q.getSig());
			q.setSig(null);
		}
		return q;		
	}		
	
	NodoPaciente eliminarFinal() {
		NodoPaciente q =getP();
		NodoPaciente x = new NodoPaciente();
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
		NodoPaciente q =getP();
		while (q != null) {
			q.getDato().mostrar();
			q = q.getSig();
		}
		System.out.println();
	} 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.persona;

/**
 *
 * @author USUARIO
 */
public class ListaS {
  	private NodoS p;		
	public ListaS(){
		p = null;
	}
	NodoS getP() { return p;}
	void setP(NodoS q) { this.p=q;}
	boolean esvacia() {	return p==null; }
	int nroNodos() {
		int c =0;
		NodoS w =getP();	
		while (w != null) {
			c+=1;
			w = w.getSig();
		}
		return c;
	}
	void adicionarPrincipio(Object l) {
		NodoS nue = new NodoS();
		nue.setDato(l);
		if (getP()==null) {
			setP(nue);			
		}else {
			nue.setSig(getP());				
			setP(nue);
		}			
	}
	public void adicionarFinal(Object x){
		NodoS nue=new NodoS();
		nue.setDato(x);		
		if(getP()==null) {
			setP(nue);
		}else{
			NodoS w=getP();
			while(w.getSig()!=null) {
				w=w.getSig();
			}
			w.setSig(nue);				
		}
	}
	NodoS eliminarPrincipio() {
		NodoS q =getP();
		if (nroNodos()==1) {			
			setP(null);
		}else {			
			setP(q.getSig());
			q.setSig(null);
		}
		return q;		
	}		
	
	NodoS eliminarFinal() {
		NodoS q =getP();
		NodoS x = new NodoS();
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
	void mostrar() {
		NodoS q =getP();
		while (q != null) {
			System.out.print(q.getDato()+"| ");
			q = q.getSig();
		}
		System.out.println();
	}  
}

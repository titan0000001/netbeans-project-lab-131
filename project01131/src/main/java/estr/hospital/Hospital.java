/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.hospital;
import estr.especialidades.*;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */

public class Hospital implements Serializable  {
	private String Nombre, propietario;
	private ListaSEspecialidades especialidades;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(String nombre, String propietario, ListaSEspecialidades especialidades) {
		super();
		Nombre = nombre;
		this.propietario = propietario;
		this.especialidades = especialidades;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public ListaSEspecialidades getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(ListaSEspecialidades especialidades) {
		this.especialidades = especialidades;
	}
	public void mostrar() {
		System.out.println("|HOSPITAL|"+getNombre()+" - "+getPropietario());
		especialidades.mostrar();
                
	}

}

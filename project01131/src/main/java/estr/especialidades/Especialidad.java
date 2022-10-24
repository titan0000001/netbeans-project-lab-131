/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estr.especialidades;
import estr.persona.*;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */

public class Especialidad implements Serializable  {
	private String nombre;
	private ListaSEmpleados listaEmpleados;
        private ListaSPacientes listaPacientes;
	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Especialidad(String nombre, ListaSEmpleados listaEmpleados, ListaSPacientes listaPacientes) {
		super();
		this.nombre = nombre;
		this.listaEmpleados = listaEmpleados;
		this.listaPacientes = listaPacientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ListaSEmpleados getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ListaSEmpleados listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public ListaSPacientes getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ListaSPacientes listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	public void mostrar() {
		System.out.println("|ESPECIALIDAD| "+getNombre());
		getListaPacientes().mostrar();
                getListaEmpleados().mostrar();
                
		
	}
}


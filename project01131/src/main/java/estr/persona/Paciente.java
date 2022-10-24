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

public class Paciente implements Serializable    {
	private int edad;
	private String sexo;
	private int id;
    private String nombre;
    
	public Paciente() {
		super();
	}

	public Paciente(int ci, String nombre,int edad, String sexo) {
		this.id = id;        
        this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
    public int getCi() {
        return id;
    }

    public void setCi(int id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	public void mostrar(){		
		System.out.println(" |Paciente| "+getNombre()+"-"+getCi()+"-"+getEdad()+"-"+getSexo());
	}
}

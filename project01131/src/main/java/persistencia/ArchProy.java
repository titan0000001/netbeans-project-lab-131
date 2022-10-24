/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;



import estr.hospital.Hospital;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.Serializable;
import java.io.NotSerializableException;
/**
 *
 * @author W10
 */
public class ArchProy implements Serializable{

	private String PATH = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\project01131\\";   // Ubicacion del archivo
	//"C:\Users\USUARIO\Documents\NetBeansProjects\project01131\Persistencia"
	private String nombre;      // nombre del archivo con xtension
	// PATH + nombre = la ubicacion del archivo y su nombre
	// Ej: persistencia/nombre.txt
	// Usar ubicacion relativa

	public ArchProy(String nombre) {
		this.nombre = nombre;
	}

	public void crear() throws FileNotFoundException, IOException {
		try {
			//File fichero = new File("test.txt");
			//System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());
			ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(PATH + nombre));
			archivo.close();

			System.out.println();
			System.out.println("Creacion correcta");
		} catch (Exception e) {
			System.out.println(e);
		}


	}

	/*
        Metodos para n cantidad de objetos
	 */
	/**
	 * Lista todos los objetos encontrados en el archivo
	 *
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void listarEstructuras() throws FileNotFoundException, IOException {
		try {
			ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
			try {
				//while (true) {
					Hospital listaX = (Hospital)archivo.readObject();
					System.out.println(listaX == null);
                                        listaX.mostrar();
				//}
			} catch (Exception e) {
				archivo.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	/**
	 * Lee los objetos guardados en la estructura y los retorna en una lista de
	 * objetos
	 *
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public LinkedList<Object> leerEstructuras() throws FileNotFoundException, IOException {
		ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
		LinkedList<Object> estruct = new LinkedList<>();
		try {
			while (true) {
				estruct.addLast(archivo.readObject());
			}
		} catch (Exception e) {
			archivo.close();
			return estruct;
		}
	}

	/**
	 * Guarda los objetos de la lista estruct en el archivo Los objetos que
	 * estaban escritos en el archivo son reemplazados con los nuevos objetos
	 *
	 * @param estruct
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public void guardarEstructuras(LinkedList<Object> estruct) throws FileNotFoundException, IOException {
		try {
			ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
			ObjectOutputStream temp = new ObjectOutputStream(new FileOutputStream(PATH + "tempFile.txt"));
			ListIterator<Object> it = estruct.listIterator();
			while (it.hasNext()) {
				Object x = it.next();
				temp.writeObject(x);
			}

			archivo.close();
			temp.close();

			// Reemplazar archivo con temp
			File fArchivo = new File(PATH + nombre);
			File fTemp = new File(PATH + "tempFile.txt");
			fArchivo.delete();
			fTemp.renameTo(fArchivo);

			System.out.println("Escritura correcta");
		} catch (Exception e) {
			System.out.println(e+ " not");
		}

	}
}
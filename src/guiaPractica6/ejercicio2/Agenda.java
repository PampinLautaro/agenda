package guiaPractica6.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	ArrayList<Contacto> contactos;
	
	public Agenda() {
		contactos = new ArrayList<>();
	}
	
	public void añadirContacto() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingesar nombre: ");
		Contacto.nombre = scanner.nextLine();
		
		System.out.println("ingrese telefono: ");
		Contacto.telefono = scanner.nextLine();
		
		System.out.println("ingrese email: ");
		Contacto.email = scanner.nextLine();
		
		Contacto nuevoContacto = new Contacto(Contacto.nombre, Contacto.telefono, Contacto.email);
		contactos.add(nuevoContacto);
		
		System.out.println("contacto añadido.");
	}
	
	public void listarContactos() {
		if(contactos.isEmpty()) {
			System.out.println("la lista esta vacia");
		} else {
			for (Contacto contacto : contactos) {
                contacto.mostrarContacto();
                System.out.println("---------------");
            }
		}
	}
	
	public void buscarContacto() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingesa el nombre a buscar:");
		String nombreBuscar = scanner.nextLine();
		
		for (Contacto contacto : contactos) {
			if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
				contacto.mostrarContacto();
				break;
			} else {
				System.out.println("contacto no encontrado.");
			}
		}
	}
	
	public void editarContacto() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingesa el nombre a buscar:");
		String nombreBuscar = scanner.next();
		
		for (Contacto contacto : contactos) {
			if (contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
				System.out.println("ingesar el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				
				System.out.println("ingrese el nuevo telefono: ");
				String nuevoTelefono = scanner.nextLine();
				
				System.out.println("ingrese el nuevo email: ");
				String nuevoEmail = scanner.nextLine();
				
				contacto = new Contacto(nuevoNombre, nuevoTelefono, nuevoEmail);
				System.out.println("contacto editado.");
				break;
			}
		}
	}
	
	public void cerrarAgenda() {
		System.out.println("agenda cerrada.");
	}
	
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		System.out.println("--------------------");
		System.out.println("menu:");
		System.out.println("1. añadir contactos");
		System.out.println("2. lista de contactos");
		System.out.println("3. busca contactos");
		System.out.println("4. editar contactos");
		System.out.println("5. cerrar agenda");
		System.out.println("seleccione una opcion:");
		System.out.println("--------------------");
		opcion = scanner.nextInt();
		scanner.nextLine(); // para limpiar el buffer (???)
		
		switch (opcion) {
			case 1: 
				añadirContacto();
				mostrarMenu();
				break;
			case 2:
				listarContactos();
				mostrarMenu();
				break;
			case 3: 
				buscarContacto();
				mostrarMenu();
				break;
			case 4:
				editarContacto();
				mostrarMenu();
				break;
			case 5:
				cerrarAgenda();
				break;
			default:
				System.out.println("opcion no valida.");
		}
	}
}

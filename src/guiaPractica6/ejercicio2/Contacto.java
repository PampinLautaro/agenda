package guiaPractica6.ejercicio2;

public class Contacto {
	static String nombre;
	static String telefono;
	static String email;
	
	public Contacto(String nombre, String telefono, String email) {
		Contacto.nombre = nombre;
		Contacto.telefono = telefono;
		Contacto.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Contacto.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		Contacto.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Contacto.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono() + ", getEmail()="
				+ getEmail() + "]";
	}
	
	public void mostrarContacto() {
		System.out.println("nombre = " + nombre);
		System.out.println("telefono = " + telefono);
		System.out.println("email = " + email);
	} 
}

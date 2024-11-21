package guiaPractica6.ejercicio1;

public class Alumno {
	private String nombre;
	private double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", nota=" + nota;
	}
	
	public void imprimir() {
		System.out.println("nombre: " + nombre);
        System.out.println("nota: " + nota);
	}
	
	public void aprovadoSiNo() {
		System.out.println("aprobado: ");
		if(nota >= 7) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
	}
}

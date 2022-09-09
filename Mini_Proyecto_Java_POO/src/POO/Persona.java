package POO;

// La clase "Persona" será la superclase (clase padre).
public class Persona {
	// Atributos
	// Se usa el modificador PRIVATE para acceder y modificar los atributos usando las funciones Getter y métodos Setter.
	private int id;
	private String nombre, apellido, domicilio, telefono;
	
	// ----------------------------------------------------------------------------------------------------- //
	
	// Constructor (Sobrecarga)
	// Construtor vacío
	public Persona() {
	}
	
	// Constructor parametrizado
	public Persona(int id, String nombre, String apellido, String domicilio, String telefono) {
		// Dar un valor a los atributos
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	} // Fin del constructor
	
	// --------------------------------------------------------------------------------------------------------- //
	
	// Getters y Setters
	// Atributo: ID
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// Atributo: Nombre
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Atributo: Apellido
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	// Atributo: Domicilio
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	// Atributo: Teléfono
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// --------------------------------------------------------------------------------------------------------- //
	
}

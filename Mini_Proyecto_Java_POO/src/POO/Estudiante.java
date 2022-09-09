package POO;

// La clase "Estudiante" heredará los atributos, métodos y funciones de la classe "Persona"
public class Estudiante extends Persona{
	// Atributos
	// Se usa el modificador PRIVATE para poder acceder y modificar los atributos usando las métodos Setter y funciones Getter.
	private int idEstudiante;
	private String nombreEscuela, estudio, aula;
	
	// ----------------------------------------------------------------------------------------------------- //
	
	// Constructor (Sobrecarga)
	// Constructor vacío
	public Estudiante() {
	}
	
	// Constructor parametrizado con herencia
	public Estudiante(int idEstudiante, String nombreEscuela, String estudio, String aula, int id, String nombre, String apellido, String domicilio, String telefono) {
		super(id, nombre, apellido, domicilio, telefono); // Atributos de la clase "Persona".
		this.idEstudiante = idEstudiante;
		this.nombreEscuela = nombreEscuela;
		this.estudio = estudio;
		this.aula = aula;
	} // Fin del constructor
	
	// ----------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo: idEstudiante
	public int getIdEstudiante() {
		return idEstudiante;
	}
	
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
	// Atributo: nombreEscuela
	public String getNombreEscuela() {
		return nombreEscuela;
	}
	
	public void setNombreEscuela(String nombreEscuela) {
		this.nombreEscuela = nombreEscuela;
	}
	
	// Atributo: Estudio
	public String getEstudio() {
		return estudio;
	}
	
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	// Atributo: aula
	public String getAula() {
		return aula;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	// ----------------------------------------------------------------------------------------------------- //
	
}

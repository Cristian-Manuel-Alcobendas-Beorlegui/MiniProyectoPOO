package POO;

public class Main {

	public static void main(String[] args) {
		// 1. Declarar el objeto
		Estudiante est1 = new Estudiante();
		
		// 2. Definir datos para el objeto "est1"
		est1.setId(1); // ID de la persona
		est1.setNombre("Tony"); // Nombre de la persona
		est1.setApellido("Stark"); // Apellido
		est1.setDomicilio("C. Mare Molas"); // Domicilio
		est1.setTelefono("682 23 12 03"); // Teléfono
		est1.setIdEstudiante(100); // ID de estudiante
		est1.setNombreEscuela("Colegio Maria Rosa Molas Reus"); // Nombre del colegio
		est1.setEstudio("Grado medio en sistemas microinformáticos en red."); // Nombre de los estudios que está cursando.
		est1.setAula("Aula 100"); // Número de aula.
		
		// 3. Mostrar los datos del objeto "est1" por pantalla
		System.out.println("Datos del estudiante " + est1.getId());
		System.out.println("----------------------------------------------");
		System.out.println("ID: " + est1.getId()); // ID de la persona
		System.out.println("Nombre: " + est1.getNombre()); // Nombre
		System.out.println("Apellido: " + est1.getApellido()); // Apellido
		System.out.println("Domicilio: " + est1.getDomicilio()); // Domicilio
		System.out.println("Teléfono: " + est1.getTelefono()); // Teléfono
		System.out.println("ID Estudiane: " + est1.getIdEstudiante()); // ID del estudiante
		System.out.println("Nombre escuela: " + est1.getNombreEscuela()); // Nombre de la escuela
		System.out.println("Estudio actual: " + est1.getEstudio()); // Estudio que cursa
		System.out.println("Aula: " + est1.getAula()); // Número de aula
		
		// Fin del programa.
	}
}

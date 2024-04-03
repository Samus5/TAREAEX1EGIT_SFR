package enrique.git;

public class Persona {
	private int edad;
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos, int edad){
		
		
		
		}
		
	public String Cumpleaños() {
		edad++;	
		String mensaje = "Felicidades "+nombre+ " ,has cumplido "+edad+ " años";
		return mensaje;
}
}
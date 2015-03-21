
public class Main {

	public static void main(String[] arg)
	{
		Fecha fecha = new Fecha(21,03,2015);
		Hora hora = new Hora(8,20);
		
		Examen examen = new Examen("Programacion en Java","au1",fecha, hora);
		
		System.out.println("Datos de Examen:\n"+examen.toString());
		
		examen.setHora(new Hora(10,0));
		
		System.out.println("\n\nDatos de Examen Actualizado:\n"+examen.toString());
	}
}


public class Examen
{
	
	private String asignatura;
	private String aula;
	private Fecha fecha; // composicion de clase Fecha en UML es un rombo relleno 
	private Hora hora;   // composicion de clase Hora
	
	public Examen(String asignatura,String aula,Fecha fecha, Hora hora)
	{
		this.asignatura=asignatura;
		this.aula=aula;
		this.fecha=fecha;
		this.hora=hora;
	}
	
	//metodos SET 
	public void setAsignatura(String asignatura)
	{
		this.asignatura=asignatura;
	}
	
	public void setAula(String aula)
	{
		this.aula=aula;
	}
	
	public void setFecha(Fecha fecha)
	{
		this.fecha=fecha;
	}
	
	public void setHora(Hora hora)
	{
		this.hora=hora;
	}
	
	//metodos GET
	
	public String getAsignatura()
	{
		return asignatura;
	}
	
	public String getAula()
	{
		return aula;
	}
	
	public Fecha getFecha()
	{
		return fecha;
	}
	
	public Hora getHora()
	{
		return hora;
	}
	
	//
	public String  toString()
	{
		return "Asignatura: "+asignatura+"\naula: "+aula+"\nFecha: "+fecha.toString()+"\nHora: "+hora.toString();
	}

}

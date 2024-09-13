package municipalidad;

public class VehiculoEstacionado {
	private String patente;
	private String horaLlegada;
	private String horaSalida;
	private int montoACobrar;
	
	public VehiculoEstacionado(String patente, String horaLLegada)
	{
		this.patente = patente;
		this.horaLlegada = horaLLegada;
		this.horaSalida = null;
		this.montoACobrar = 0; 
	}
	
	public String getPatente()
	{
		return patente;
	}
	
	public String getHoraLlegada()
	{
		return horaLlegada;
	}
	
	public String getHoraSalida()
	{
		return horaSalida;
	}
	
	public int getMontoACobrar()
	{
		return montoACobrar;
	}
	
	public void setMontoACobrar(int montoACobrar)
	{
		this.montoACobrar = montoACobrar;
	}
	
}


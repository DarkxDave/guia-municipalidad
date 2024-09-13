package municipalidad;

import java.util.ArrayList;

public class Parquimetro 
{
/*
	private String id;
	private String nombreCuadra;
	private String sectorCiudad;
	private int ganancias;
	private ArrayList<VehiculoEstacionado> vehiculosEstacionados;
	
*/
	public boolean agregarVehiculoEstacionado(String patente, String horaLlegada)
	{
		for (VehiculoEstacionado vehiculo : vehiculosEstacionados)
		{
			if (vehiculo.getPatente().equals(patente) && vehiculo.getHoraLlegada().equals(horaLlegada))
				return false;
		}
		VehiculoEstacionado nuevoVehiculo = new VehiculoEstacionado(patente, horaLlegada);
		vehiculosEstacionados.add(nuevoVehiculo);
		return true;
	}
	
/*
	public String getId() {
        return id;
    }

    public String getNombreDeCuadra() {
        return nombreCuadra;
    }

    public String getSector() {
        return sectorCiudad;
    }

    public int getMontoTotalDeGanancias() {
        return ganancias;
    }

    public ArrayList<VehiculoEstacionado> getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }
*/
}

package municipalidad;

/* La clase Municipalidad mantiene en su interior un conjunto de Parquimetros. 
 * Cada Parquimetro tiene una coleccion de VehiculosEstacionados durante el dia en ese parquimetro.
 * Cada VehiculoEstacionado se identifica por su patente (String) mas de una hora de llegada (String).
 * Tambien posee hora de salida (String) y monto a cobrar (int). Se pide hacer las siguientes Clases.
 */

/*
 * Municipalidad: Contiene una instancia de MiLista en la que se almacenan sus objetos Parquimetro.
 * La clase Municipalidad provee los siguientes Metodos:
 * agregarParquimetro: recibe un objeto parquimetro y lo agrega a su coleccion de Parquimetros y lo agrega a su coleccion de Parquimetros si este no se encuentra ya en la coleccion.
 * En caso de ya existir, no lo agrega retornando false.
 * Retorna true en caso de exito
 */

/* 
 * Metodo agregarVehiculoEstacionado: recibe una patente del VehiculoEstacionado (String), un identificador de Parquimetro (String) y una hora de llegada.
 * Agrega el VehiculoEstacionado al Parquimetro indicado, si este existe. 
 * Retorna true si el VehiculoEstacionado pudo ser agregado (existia el Parquimetro y patente + hora llegada no existian en el parquimetro),
 * o false en caso contrario. Debe usar el Metodo agregarVehiculoEstacionado de la clase Parquimetro
 */

public class Municipalidad
{
	private MiLista parquimetros = new MiLista();
	
	public boolean agregarParquimetro(Parquimetro parquimetro)
	{
		parquimetros.irInicio();
		while (!parquimetros.alFinal())
		{
			Parquimetro actual = (Parquimetro) parquimetros.datoActual();
			if (actual.getId().equals(parquimetro.getId()))
				return false;
			parquimetros.avanzar();
		}
		parquimetros.agrega(parquimetro);
		return true;
	}

	public boolean agregarVehiculoEstacionado(String patente, String idParquimetro, String horaLlegada)
	{
		parquimetros.irInicio();
		while(!parquimetros.alFinal())
		{
			Parquimetro actual = (Parquimetro) parquimetros.datoActual();
			if (actual.getId().equals(idParquimetro))
				return actual.agregarVehiculoEstacionado(patente, horaLlegada);
			parquimetros.avanzar();
		}
		return false;
	}
}

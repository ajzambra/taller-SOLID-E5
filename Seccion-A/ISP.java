//ISP
//la interfaz vehiculos trata de abarcar todos los escenarios
//la clase moto no necesita implementar todos los metodos

public interface Vehiculos{
	public void acelerar();
	public void frenar();
	public void despegar();
	public void aterrizar();
}

public class Moto implements Vehiculos{
	public void acelerar(){
		//acelerar la moto
	}
	public void frenar(){
		//frenar la moto
	}
	public void despegar(){
		//excepcion
	}
	public void aterrizar(){
		//excepcion
	}
}

//MANERA CORRECTA
//meter dentro de varias interfaces metodos relacionados, obedeciendo un mismo contexto
public interface VehiculosTierra{
	public void acelerar();
	public void frenar();
}

public interface VehiculosAire{
	public void despegar();
	public void aterrizar();
}

public class Moto implements VehiculosTierra{
	public void acelerar(){
		//acelerar la moto
	}
	public void frenar(){
		//frenar la moto
	}
}
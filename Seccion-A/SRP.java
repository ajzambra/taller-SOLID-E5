//SRP
//muchas responsabilidades y si cambia la manera de calcular valores, se debe modificar
public class Empresa{	
	public double PagoFinal(Empleado empleado){
		double valor = this.valorAPagar(empleado);
		double multas = this.multasADescontar(empleado)
		return valor - multas;
	}	
	public double valorAPagar(Empleado empleado) {
		double valor;
		//calcular valor 
		return valor;
	}
	public double multasADescontar(Empleado empleado) {
		double multas;
		//calcular multas
		return multas;
	}
}

//MANERA CORRECTA
//si cambia la manera de calcular el valor o las multas, no afectara a la clase empresa
//esta solo se encarga de entregar el valor final

public class Empresa{
	public double PagoFinal(Empleado empleado){
		double valor = ValorTrabajo.valorAPagar(empleado);
		double multas = MultasPorDescontar.multasADescontar(empleado)
		return valor - multas;
	}	
}

public class ValorTrabajo{
	public static double valorAPagar(Empleado empleado) {
		double valor;
		//calcular valor 
		return valor;
	}

}

public class MultasPorDescontar{
	public static double multasADescontar(Empleado empleado) {
		double multas;
		//calcular multas
		return multas;
	}
}
//DIP
//Se viola el principio de DIP debido a que deberia usar interfaces que
//agrupen aquellos comportamientos que tienen el común, 
//ademas de que la clase de más alto nivel como lo es Factura depende de 
// clases de bajo nivel como lo son CalcularIVA Y CalcularDeduccion
 
public class Factura{
	public String codigo;
	public Date fechaEmision;
	public float importeFactura;
	public float importeIVA;
	public float importeDeduccion;
	public float importeTotal;
	public int porcentajeDeduccion;

	public void calcularTotal(){
		CalcularDeduccion cd= new CalcularDeduccion(porcentajeDeduccion);
		importeDeduccion= cd.calculaDeduccion(importeFactura);
		CalcularIVA ci= new CalcularIVA();
		importeIVA= ci.alculaIVA(importeFactura);
		importeTotal= (importeFactura-importeDeduccion)+importeIVA
	}

}
//MANERA CORRECTA:
// de esta manera agrupando los comportamientos 
// logramos conseguir que las clases de alto nivel no dependen de los de bajo nivel 	
public interface IDeduccion{

	public float CalcularDeduccion(float importeFactura);
}


public interface IIVA{
	public float calcularIVA(float importeFactura);
}

public class Factura{
	private IDeducion cd;
	private IIVA ci;
	
	public Factura(IDeducion pcd, IIVA pci){
	 	cd= pcd;
		ci= pci
	}

	public void calcularTotal(){
		importeDeduccion= cd.calculaDeduccion(importeFactura);
	
		importeIVA= ci.alculaIVA(importeFactura);
		importeTotal= (importeFactura-importeDeduccion)+importeIVA
	}

}


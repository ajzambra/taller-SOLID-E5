//OCP
//si se necesitan mas tipos de generar reportes se debe modificar la clase

public class Reportes{
	public void reporteEmpleados(List empleados, String tipo) {
		if(Objects.equals(tipo, "PDF")){
			reportePDF(empleados);
		}
		else if(Objects.equals(tipo, "WORD")) {
			reporteWORD(empleados);
		}
		else {
			reporteEXCEL(empleados);
		}
	}
	
	public void reportePDF(List empleados) {
		//generar reporte en PDF
	}
	public void reporteWORD(List empleados) {
		//generar reporte en WORD
	}
	public void reporteEXCEL(List empleados) {
		//generar reporte en EXCEL
	}
}

//MANERA CORRECTA
//si necesitan otro tipo de reporte, solo se crea otra clase de ese tipo e implementar
//la interfaz generadorreporte, ya no modificar la clase inicial

public interface GeneradorReporte{
	public void generarReporte(List empleados);
}

public class ReportePDF implements GeneradorReporte{
	//atributos
	public void generarReporte(List empleados) {
		//generar reporte en PDF
	}
}

public class ReporteWORD implements GeneradorReporte{
	//atributos
	public void generarReporte(List empleados) {
		//generar reporte en WORD
	}
}

public class ReporteEXCEL implements GeneradorReporte{
	//atributos
	public void generarReporte(List empleados) {
		//generar reporte en EXCEL
	}
}

public class Reportes{
	public void reporteEmpleados(List empleados, GeneradorReporte generador) {
		generador.generarReporte(empleados);
	}
}
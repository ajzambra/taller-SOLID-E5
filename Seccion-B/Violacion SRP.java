public interface Pago {
    //Atributos
    public void realizarCobro(double monto);
}

public class Impuesto{
    //Atributos
    public void calcularImpuestosFactura(double monto){
        //Calcula impuestos
    }
}
public class Factura{
    //Atributos
    public void generarFactura(){
        //Genera factura
    }
}
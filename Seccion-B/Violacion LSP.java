public class PagoPaypal implements Pago{
    Paypal paypal; //Objeto tipo paypal
    @Override
    public void realizarCobro(double monto){
        if(!paypal.loggedIn){
            paypal.logged(); //Realiza el logeo para continuar
        }
        //Realiza el cobro
    }
}

public class Paypal{
    protected boolean loggedIn; //conexion a cuenta Paypal
    //Atributos
    public void logged(){
        //Loggear en paypal
        loggedIn = true;
    }
}
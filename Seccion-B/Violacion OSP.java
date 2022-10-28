public interface TipoMedio {
    public void notificar (Pago pago);
}

public class Email implements TipoMedio{
    //Atributos
    public void notificar (Pago pago){
        //Implementacion para que haga la notificacion
    }
}

public class Sms implements TipoMedio{
    //Atributos
    public void notificar (Pago pago){
        //Implementacion para que haga la notificacion
    }
}

public class Notificacion{
    //Atributo
    public void hacerNoti(TipoMedio medio){
        //Llamar el metodo notificar de cada medio
        medio.notificar(Pago pago);
    }
}

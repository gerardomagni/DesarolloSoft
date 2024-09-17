package entidades;

public class MercadoPagoPago implements  PasarelaPagos{

    @Override
    public void realizarPago(double monto) throws PagoExcepcion {
        System.out.println("Realizando un pago de " + monto + " con Mercado Pago");
    }
}

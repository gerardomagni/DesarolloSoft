package entidades;

public interface Operacion {

    void pagar(PasarelaPagos pago) throws PagoExcepcion;
}

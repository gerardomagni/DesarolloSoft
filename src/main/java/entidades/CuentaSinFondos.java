package entidades;

public class CuentaSinFondos implements PasarelaPagos{
    @Override
    public void realizarPago(double monto) throws PagoExcepcion {
        throw new PagoExcepcion("No tiene fondos para pagar");
    }
}

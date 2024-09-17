package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class PedidoTest {

    @Test
    public void pruebasUnitariasPedido(){

        Articulo art1 = new Articulo("Fideos", 1500);
        Articulo art2 = new Articulo("Vino Malbec", 4200);

        Pedido pedido = new Pedido();
        pedido.agregarItem(art1);
        pedido.agregarItem(art2);

        //como norma se coloca primero lo esperado y segundo lo que realmente se obtuvo
        //si se coloca al reves tampoco esta mal
        Assertions.assertEquals(2, pedido.cantidadItems());

        Articulo art3 = new Articulo("Asado", 14200);
        pedido.agregarItem(art3);

        Assertions.assertEquals(3, pedido.cantidadItems());

        //puedo agregar mensajes especificos al test
        Assertions.assertTrue(pedido.totalPedido() > 0, "El total del del pedido debe ser mayor a cero");

        Assertions.assertTrue(pedido.cantidadItems() > 0);
    }

    @Test
    public void pruebasTiempoRespuesta(){
        Articulo art1 = new Articulo("Fideos", 1500);
        Articulo art2 = new Articulo("Vino Malbec", 4200);

        Pedido pedido = new Pedido();
        pedido.agregarItem(art1);
        pedido.agregarItem(art2);

        Assertions.assertTimeout(Duration.ofMillis(2000), () -> Thread.sleep(3000));
    }

    @Test
    public void pruebasArrays(){
        int [] arregloUno = new int[] {1,5,8,7,6,3};
        int [] arregloDos = new int[] {1,5,8,7,6,3};

        Assertions.assertEquals(arregloUno, arregloDos);// falla son instancias distintas
        Assertions.assertArrayEquals(arregloUno, arregloDos);//ok compara los elementos
    }

    //Excepciones
    @Test
    public void testPagoMercadoPago() throws PagoExcepcion{
        MercadoPagoPago mp = new MercadoPagoPago();
        mp.realizarPago(1500d);
    }

    @Test
    public void testPagoCuentaSinFondos() throws PagoExcepcion{
        CuentaSinFondos csf = new CuentaSinFondos();
        PagoExcepcion pagoExcepcion = Assertions.assertThrows(PagoExcepcion.class, () -> {
            csf.realizarPago(1500d);
        });
    }

}

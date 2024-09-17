package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Carrito, Operacion {

    private final List<Articulo> articulos = new ArrayList<Articulo>();

    @Override
    public void agregarItem(Articulo articulo) {
        this.articulos.add(articulo);
    }

    @Override
    public int cantidadItems() {
        return this.articulos.size();
    }

    @Override
    public double totalPedido() {
        /*
        double total = 0;
        for(Articulo art : this.articulos){
            total += art.getPrecio();
        }
        return total;
        */
        //realizo el calculo anterior mediante stream, map y reduce
        return this.articulos.stream().map(Articulo::getPrecio).reduce(0d, Double::sum);
    }

    @Override
    public void vaciarCarrito() {
        this.articulos.clear();
    }


    @Override
    public void pagar(PasarelaPagos pago) throws PagoExcepcion {

    }
}

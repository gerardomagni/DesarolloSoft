package entidades;

public interface Carrito {

    void agregarItem(Articulo articulo);

    int cantidadItems();

    double totalPedido();

    void vaciarCarrito();

}

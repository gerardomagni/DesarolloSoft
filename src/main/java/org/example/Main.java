package org.example;

import entidades.Articulo;
import entidades.Pedido;

public class Main {
    public static void main(String[] args) {

        Articulo art1 = new Articulo("Fideos", 1500);
        Articulo art2 = new Articulo("Vino Malbec", 4200);

        Pedido pedido = new Pedido();
        pedido.agregarItem(art1);
        pedido.agregarItem(art2);

        System.out.println("Cantidad Items: " + pedido.cantidadItems());
        System.out.println("Monto Total: $" + pedido.totalPedido());

        //JUnit -> Pruebas Unitarias

    }
}
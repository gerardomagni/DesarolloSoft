package entidades;

public class Articulo {

    private String denominacion;
    private double precio;

    public Articulo() {
    }

    public  Articulo (String denominacion, double precio) {
        this.denominacion = denominacion;
        this.precio = precio;
    }


    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

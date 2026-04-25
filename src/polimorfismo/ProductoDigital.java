package polimorfismo;

public class ProductoDigital  extends Producto {
    private String tipoEntrega;

    public ProductoDigital(String nombre, double precio, String tipoEntrega) {
        super(nombre, precio);
        this.tipoEntrega = tipoEntrega;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Producto digital: " + nombre + ", Precio: Q" + precio + ", Entrega: " + tipoEntrega);
    }
}

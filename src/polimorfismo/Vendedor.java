package polimorfismo;

public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double comision) {
        super(nombre);
        this.comision = comision;
    }

    @Override
    public String resumen() {
        return "Vendedor: " + nombre + ", Comisión: Q" + comision;
    }
}


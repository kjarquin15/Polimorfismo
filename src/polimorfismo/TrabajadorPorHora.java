package polimorfismo;

public class TrabajadorPorHora extends Trabajador {
    private int horas;
    private double pagoPorHora;

    public TrabajadorPorHora(int horas, double pagoPorHora) {
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horas * pagoPorHora;
    }

}

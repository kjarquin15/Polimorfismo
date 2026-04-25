package polimorfismo;

public class Avion extends Transporte {
    @Override
    public void moverse() {
        System.out.println("El avión vuela ✈️");
    }
}

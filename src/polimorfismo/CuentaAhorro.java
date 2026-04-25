package polimorfismo;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double monto) {
        double interes = monto * 0.05;
        saldo += monto + interes;
        System.out.println("Depósito con interés. Saldo: Q" + saldo);
    }

}

package polimorfismo;

public class Main {

	  public static void main(String[] args) {

	        // ===============================
	        // 1. Animal y Perro
	        // ===============================
	        Animal animal = new Perro();
	        animal.hacerSonido();

	        // ===============================
	        // 2. Figura y Rectangulo
	        // ===============================
	        Figura figura = new Rectangulo(5, 3);
	        System.out.println("Área del rectángulo: " + figura.area());

	        // ===============================
	        // 3. Empleado y Vendedor
	        // ===============================
	        Empleado emp = new Vendedor("Carlos", 500);
	        System.out.println(emp.resumen());

	        // ===============================
	        // 4. Cuenta y CuentaAhorro
	        // ===============================
	        Cuenta cuenta = new CuentaAhorro(1000);
	        cuenta.depositar(500);

	        // ===============================
	        // 5. Transporte y Avion
	        // ===============================
	        Transporte transporte = new Avion();
	        transporte.moverse();

	        // ===============================
	        // 6. Persona y Estudiante
	        // ===============================
	        Persona persona = new Estudiante("Ana", "202401", "Ingeniería");
	        persona.presentarse();

	        // ===============================
	        // 7. Vehiculo y Motocicleta
	        // ===============================
	        Vehiculo vehiculo = new Motocicleta();
	        vehiculo.encender();

	        // ===============================
	        // 8. Producto y ProductoDigital
	        // ===============================
	        Producto producto = new ProductoDigital("Curso Java", 150, "Descarga online");
	        producto.mostrarDescripcion();

	        // ===============================
	        // 9. Instrumento y Guitarra
	        // ===============================
	        Instrumento instrumento = new Guitarra();
	        instrumento.tocar();

	        // ===============================
	        // 10. Trabajador y TrabajadorPorHora
	        // ===============================
	        Trabajador trabajador = new TrabajadorPorHora(8, 50);
	        System.out.println("Pago: Q" + trabajador.calcularPago());
	    }
	}

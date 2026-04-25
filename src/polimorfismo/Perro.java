package polimorfismo;

public class Perro extends Animal {
	// Herencia: Perro hereda de Animal
	// Sobrescritura: hacerSonido()
	    @Override
	    public void hacerSonido() {
	        System.out.println("El perro ladra ");
	    }
}

package polimorfismo;

public class Animal {
	public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

/*
Herencia: Perro hereda de Animal
Sobrescritura: hacerSonido()
*/
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra 🐶");
    }
}


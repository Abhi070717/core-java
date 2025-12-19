package in.co.rays.oop.abstraction;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Cat();

		Cat c1 = (Cat) a1;

		System.out.println(c1.voice());
		
		Animal a2 = new Dog();
		
		Dog d = (Dog) a2;
		
		System.out.println(d.voice());
		
		Animal a3 = new Cow();
		
		Cow c2 = (Cow) a3;
		
		System.out.println(c2.voice());
	}

}

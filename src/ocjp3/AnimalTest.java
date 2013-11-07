package ocjp3;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Dog();
		Dog dog = new Dog();
		Animal animal = (Animal)dog;

		//Animal animal = new Animal();
		System.out.println(animal);
		Cat cat = (Cat)animal;
		System.out.println(cat.noise());
	}
}
class Animal{
	public String noise(){
		return "peep";
	}
}

class Dog extends Animal{
	public String noise(){
		return "back";
	}
}

class Cat extends Animal{
	public String noise(){
		return "move";
	}
}

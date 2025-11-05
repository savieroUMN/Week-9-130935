package week09.saviero.id.ac.umn;

public class Mammal implements Animal {
	public Mammal() {}
	
	public void eat() {
		System.out.println("mammal eats");
	}
	
	public void travel() {
		System.out.println("mammal travel");
	}
	
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	};
}

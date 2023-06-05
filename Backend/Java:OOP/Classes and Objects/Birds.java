class Bird {
	String Name;
	int age;
	String color;
	boolean AbleToFly;
	
	void migrate() {
		System.out.println("Bird is migrating");
	}
	void findFood() {
		System.out.println("Bird is finding food");
	}
	void buildNest() {
		System.out.println("Bird is building nest");
	}
}

public class Birds {
	Bird parrot = new Bird();
	Bird chicken = new Bird();
	Bird flamingo = new Bird();

}

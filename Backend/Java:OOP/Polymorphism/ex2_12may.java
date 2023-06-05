
class Animal {
	
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void sleep(){
		System.out.println("Animal is sleeping");
	}
}

class Tiger extends Animal {
	
	public void eat(){
		System.out.println("Tiger is eating");
	}
	public void sleep(){
		System.out.println("Tiger is sleeping");
	}
}

class Lion extends Animal {
	
	public void eat(){
		System.out.println("Lion is eating");
	}
	public void sleep(){
		System.out.println("Lion is sleeping");
	}
}

class Dog extends Animal {
	
	public void eat(){
		System.out.println("Dog is eating");
	}
	public void sleep(){
		System.out.println("Dog is sleeping");
	}
}

class Forest
{
	public void animalCur(Animal ref)
	{
		ref.eat();
		ref.sleep();
	}
}



public class ex2_12may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger(); 
		Lion lion = new Lion();
		Dog dog = new Dog(); 
		Forest forest = new Forest();
		forest.animalCur(tiger);
		forest.animalCur(lion);
		forest.animalCur(dog);

	}

}

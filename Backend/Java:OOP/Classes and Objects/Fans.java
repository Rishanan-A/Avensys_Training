class Fan {
	String color;
	String brand;
	int noOfWings;
	
	void rotate() {
		System.out.println("Fan is rotating");
	}
	void stop() {
		System.out.println("Fan has stopped");
	}
	void blowAir() {
		System.out.println("Fan is running");
	}
}

public class Fans {
	
	public static void main(String[] args) {
		Fan fan_1 = new Fan();
		Fan fan_2 = new Fan();
		Fan fan_3 = new Fan();
		
		fan_1.rotate();
		fan_2.stop();
		fan_3.blowAir();
		
	}

}

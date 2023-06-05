
class Fan2 extends Object
{
	private String brand; 
	private int maxSpeed;     
	private String serialNumber; 
	
	public Fan2() 
	{
		//super();
	}
	public Fan2(String brand, int maxSpeed, String serialNumber)
	{
		this();
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.serialNumber = serialNumber;	
	}
	public Fan2(String brand, int maxSpeed)
	{
		this("Toyoto", 5, "as123ih12");
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	public Fan2(String brand)
	{
		this("Shusha",3);
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public int getmaxSpeed()
	{
		return maxSpeed;
	}
	public String getserialNumber()
	{
		return serialNumber;
	}
}



public class ex1_9may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan2 fan = new Fan2("LG");
		System.out.println("Brand: "+fan.getBrand());
		System.out.println("Max speed: "+fan.getmaxSpeed());
		System.out.println("Serial Number: "+fan.getserialNumber());

	}

}




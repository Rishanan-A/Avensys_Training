import java.util.Scanner;

interface calculateSI
{
	 public void acceptInput();
	 public void findSI();
	 public void display();
}
class BusinessMan_1 implements calculateSI
{
	private double amount;
    private double roi;
    private double time;
    private double total;

    public void acceptInput() {
        amount = 1000;
        roi = 1.4;
        time = 2;
    }

    public void findSI() {
        total = (amount * roi * time) / 100; 
    }

    public void display() {
        System.out.println("Simple interest:" + this.total+"\n");
    }
}
class BusinessMan_2 implements calculateSI
{
	
	private double amount;
    private double roi;
    private double time;
    private double total;

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        this.amount = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        this.roi = scanner.nextDouble();

        System.out.println("Enter the time (in years):");
        this.time = scanner.nextDouble();
    }

    public void findSI() {
        total = (amount * roi * time) / 100; 
    }

    public void display() {
        System.out.println("Simple interest:" + this.total+"\n");
    }

}
class BusinessMan_3 implements calculateSI
{
	private double amount;
    private double roi;
    private double time;
    private double total;

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        this.amount = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        this.roi = scanner.nextDouble();

        System.out.println("Enter the time (in years):");
        this.time = scanner.nextDouble();
    }
    
	public void findSI()
	{
		if(amount==0 || roi==0 || time==0)
		{
			System.out.println("Error in input");
		}
		else 
		{
			total = (amount * roi * time) / 100; 
		}
	}
	public void display() {
        System.out.println("Simple interest:" + this.total+"\n");
    }
	
}
class SI_Calc
{
	public void acceptCalculator(calculateSI ref)
	{
		
		ref.acceptInput();
		ref.findSI();
		ref.display();
	}
}
class ex1_15may extends Object {
	
	public static void main(String[] args) {
		BusinessMan_1 bm1 = new BusinessMan_1();
		BusinessMan_2 bm2 = new BusinessMan_2();
		BusinessMan_3 bm3 = new BusinessMan_3();
		SI_Calc si = new SI_Calc();
		si.acceptCalculator(bm1);
		si.acceptCalculator(bm2);
		si.acceptCalculator(bm3);
	} 
}


class Calculator
{
	
	public static double add(int a, double b) {
		return a+b;
		
	}
	public static double add(int a, double b, double c) {
		return a+b+c;
		
	}
}

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b = 20.5;
		int w = 10;
		double res = Calculator.add(a,b,w);
		double res1 = Calculator.add(a,b);
		System.out.println(res);
	}

}

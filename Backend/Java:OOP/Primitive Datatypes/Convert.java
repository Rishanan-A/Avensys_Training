import static java.lang.System.out;

public class Convert {
	
	public static void main(String[] args) {
		//byte->short
		byte a = 50;
		short b;
		b=a;
		try {
			out.println(b);
		}
		catch (ArithmeticException z){
			out.println("Error byte -> short");
		}
		
		//int->long
		int c = 50;
		long d;
		d=c;
		try {
			out.println(d);
		}
		catch (ArithmeticException z){
			out.println("Error int->long");
		}
		
		//float->double
		float e = 50.5f;
		double f;
		f=e;
		try {
			out.println(f);
		}
		catch (ArithmeticException z){
			out.println("Error float->double");
		}
		
		//char->int
		char g = 'A';
		int h;
		h=g;
		try {
			out.println(h);
		}
		catch (ArithmeticException z){
			out.println("Error char->int");
		}
		
	}

}

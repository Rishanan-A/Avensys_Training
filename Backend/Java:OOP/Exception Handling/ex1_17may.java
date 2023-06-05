import java.util.Scanner;

class overAgeException extends Exception
{
	public String getMessage()
	{
		return "Age above 45 error";
	}
}

class underAgeException extends Exception
{
	public String getMessage()
	{
		return "Age below 18 error";
	}
}

class matchFinder
{
	int age = 0;

	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scan.nextInt();

	}
	public void verify() throws underAgeException, overAgeException 
	{
		if(age<18)
		{
			underAgeException ua = new underAgeException();
			throw ua;
		}
		else if (age>45)
		{
			overAgeException oa = new overAgeException();
			throw oa;
		}
		else
		{
			System.out.println("Account active");
		}
	}
}

class account
{
	public void intiate() throws underAgeException, overAgeException
	{
		matchFinder mf = new matchFinder();
		mf.acceptInput();
        mf.verify();
	}
}

public class ex1_17may {

	public static void main(String[] args) throws underAgeException, overAgeException {
		// TODO Auto-generated method stub
		account acc = new account();
		acc.intiate();

	}

}

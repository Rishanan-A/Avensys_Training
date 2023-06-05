import java.util.Scanner;
class InValidInputException extends Exception
{
	public String getMessage()
	{
		return "InValid Input!! We are blocking your card, Please reach out to the bank";
	}
}
class ATM2
{
	int accNo = 1111;
	int passWord = 9999;
	int ac;
	int pw;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account number");
		ac = scan.nextInt();
		System.out.println("Enter the password");
		pw = scan.nextInt();
	}
	
	public void verify() throws InValidInputException 
	{
		if(accNo == ac && passWord == pw)
		{
			System.out.println("Hey Valid User !! Please Collect Your Money");
		}
		else
		{
			InValidInputException ie = new InValidInputException();
			throw ie;
		}
	}
}
class Bank
{
	public void intiate()
	{
		ATM2 ATM2 = new ATM2();
		int maxAttempts = 3;

		for (int i = 0; i < maxAttempts; i++) {
		    try {
		        ATM2.acceptInput();
		        ATM2.verify();
		        break;
		    } catch (InValidInputException e) {
		        if (i < maxAttempts - 1) {
		            System.out.println("You have left out only " + (maxAttempts - i - 1) + " chances");
		        } else {
		            System.out.println("You have reached maximum attempt you can contact your bank");
		        }
		    }
		}
	}
}
class custom_exception
{
	public static void main(String[] args)  {
		Bank b = new Bank();
		b.intiate();
	}

}
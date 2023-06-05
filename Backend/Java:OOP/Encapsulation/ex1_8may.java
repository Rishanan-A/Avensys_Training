


class price{
	
	private float amount;
	
	public void setAmount(float x) {
		if (amount >=0) {
			amount = x;
		}
		else {
			System.out.println("Error in setting amount");
		}
	
	}
	
	public float getAmount() {
		return amount;
		}
	
}

public class ex1_8may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		price price = new price();
		price.setAmount(10.21f);
		float amt = price.getAmount();
		System.out.println(amt);
	}

}

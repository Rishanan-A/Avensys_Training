abstract class livingThings 
{
	abstract public void hunt(); 
	abstract public void colour();
}
abstract class Tiger2 extends livingThings
{
	
	public void hunt() 
	{
		System.out.println("Tiger is hunting a deer");
	}
}
abstract class Lion2 extends livingThings
{
	public void hunt()
	{
		System.out.println("Lion is hunting a elephant");
	}
}
class WhiteTiger extends Tiger2 
{
	public void colour()
	{
		System.out.println("White tiger is white in colour");
	}
}
class BengalTiger extends Tiger2 
{
	public void colour()
	{
		System.out.println("Bengal tiger is orange in colour");
	}
}
class TransvaalLion extends Lion2
{
	public void colour()
	{
		System.out.println("Transvaal lion is white in colour");
	}
}
class CongoLion extends Lion2
{
	public void colour()
	{
		System.out.println("Congo lion is brown in colour");
	}
}
class Jungle
{
	public void acceptLivingThings(livingThings ref)
	{
		ref.hunt();
		ref.colour();
	}
}
class ex3_12may extends Object {
	
	public static void main(String[] args) {
		
		WhiteTiger wt = new WhiteTiger();
		BengalTiger bt = new BengalTiger();
		TransvaalLion tl = new TransvaalLion();
		CongoLion cl = new CongoLion();
		Jungle j = new Jungle();
		j.acceptLivingThings(wt);
		j.acceptLivingThings(bt);
		j.acceptLivingThings(tl);
		j.acceptLivingThings(cl);
	
	} 
}
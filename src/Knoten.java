public class Knoten
{
	private int value;
	private Knoten lNext;
	private Knoten rNext;
	
	public Knoten(int value,Knoten lNext,Knoten rNext){
		
		this.value=value;
		this.lNext=lNext;
		this.rNext=rNext;
		
	}
	
	public void whoAmI(){
		System.out.println("My value is :"+value);
	}
}

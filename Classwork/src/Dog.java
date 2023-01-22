
public class Dog extends Canine{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("The dog woofs");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The dog eats dog food and chews on bone");
	}
	
	public void doTricks() {
		System.out.println("Rolling over, etc.");
	}

}

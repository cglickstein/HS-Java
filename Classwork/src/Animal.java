
public abstract class Animal {
	//instance variables
	private String picture;
	private String food;
	private int hunger;
	private int [][] boundaries;
	private int locationX;
	private int locationY;
	//every Animal will have these instance vars because abstract class
	
	//getters and setters (accessors and mutators)
	public String getPicture() {
		return picture;
	}
	public void setPicture( String picture) {
		this.picture=picture; //sent it a variable called picture. instance var picture sent into it.
	}
	public String getFood() { //don't have Food
		return food;
	}
	public int getHunger() {
		return hunger;
	
	//common methods
	}
	public void sleep() {
		System.out.println("The animal sleeps");
	}
	public void roam() {
		System.out.println("The animal is roaming");
	}
	//methods that must be implemented below the hierarchy
	public abstract void makeNoise(); //within subclass
	public abstract void eat();
}

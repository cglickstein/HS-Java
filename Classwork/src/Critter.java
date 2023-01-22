
public class Critter {
	//has some instance vars and static var
	private String critName;
	private String critMood;
	private int critHunger;
	private int critBoredom;
	
	private static int total; //static means each critter has name, mood, hunger but can also access same total which is overall
	
	//constructor
	public Critter(String name,String mood)
	{
		System.out.println("A new critter has been born. Mazel tov!");
		critName=name;
		critMood=mood;
		total++;
		//we can change static variable even though doesn't have static
		//critHunger++;
		//critBoredom++;
		passTime();
	}
	
	//another constructor- sending just name
	public Critter(String name)
	{
		System.out.println("A new critter has been born! Mazel Tov!");
		critName=name;
		total++;
		critHunger++;
		critBoredom++;
		//if dont pass mood then makes it bored
	}
	public static int getTotal() //static dealing with overall vars. can't change variable of instance variable but can increase total in top
	{
		return total;
	}
	
	public static String getStatus()
	{
		return "The total number of critters is"+total;
	}
	// works same way as getTotal but returns a string
	public void talk()
	{
		System.out.println("Hi. I'm an instance of class Critter.");
		System.out.println("My name is "+critName);
		passTime();
	}
	
	public void eat(int food)
	{
		System.out.println("Burp. Thank you!");
		critHunger-=food; 
		if (critHunger<0)
			critHunger=0;
		passTime();
	}
	public void play(int fun)
	{
		System.out.println("Wheee! Thank you");
		critBoredom-=fun;
		if (critBoredom<0)
			critBoredom=0;
		passTime();
	}
	public String Mood(String mood)
	{
		int unhappiness=critHunger+critBoredom;
		if (unhappiness<5)
			critMood="happy";
		else if(unhappiness<10)
			critMood="okay";
		else if (unhappiness<15)
			critMood="frustrated";
		else 
			critMood="mad";
		return critMood;
	}
	
	public String getMood()
	{
		return ("Right now I'm "+critMood);
	}
	private void passTime()
	//only something called from critter class itself (have critter pass time from main if public)
	{
		critHunger+=1;
		critBoredom++;
	}
	
	public String toString()
	{
		return "My name is "+critName+". I am "+critMood+". My hunger level is "+critHunger+", and my boredom level is "+ critBoredom;
	}
}


public class demoPoly {

	public static void main(String[] args) {
		Animal myDog= new Dog(); //UPCASTING
		Dog yourDog=new Dog();
		myDog.makeNoise(); //the dog barks from before
		//myDog.doTricks(); //dont have this method heading in super class like eat and do tricks
		//compiler method because no such method in animal because first defined as animal and polymorphic so both it has to be in both
		//Dog yourDog=new Dog();
		yourDog.doTricks(); //didnt give us error when did yourDog becuase your just dog. defined as dog then given. mydog has to at leas tbe mentioned in super class (no teven subclass)
		//myDog is both so doesn't work (sub class and super class)
		
		//get myDog to do tricks
		Dog myDogRef= (Dog)myDog; //taking myDog and casting so it's completely a dog!
		//above called DOWNCAST REFERENCE BACK TO TYPE DOG BECAUSE WAS PARTLY ANIMAL AND NOW JUST DOG
		myDogRef.doTricks();
		((Dog)myDog).doTricks();
	}

}


public class mainZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inheritance in Action");
		System.out.println("----------------------------");
		
		Animal w=new Wolf();//Wolf w would print the same thing
		//two dif classes. uses method in both, subclass, closer to it. goes back to animal
		//like cast int to double. cast this to be wolf and use features from both because in two states 
		//POLYMORPHIC ARGUMENTS
		w.makeNoise();
		w.roam();//method is called to wolf, goes to canine, returns to wolf
		w.eat();//called from wolf class
		w.sleep();//called from animal class
		
		System.out.println("Polymorphism in Action");
		System.out.println("----------------------------");
		
		//Creating array of animals to see polymorphism
		Animal[] animals=new Animal[5];
		animals[0]=new Dog();
		animals[1]=new Cat();
		animals[2]=new Wolf();//wolf has its own roam method
		animals[3]=new Hippo();
		animals[4]=new Lion();
		
		for (int i=0; i<animals.length;i++) {
			animals[i].eat();
			animals[i].roam();
		}
		//separator
		System.out.println("Polymorphism in Action");
		System.out.println("----------------------------");
		
		Vet newVet= new Vet();
		newVet.giveShot(w); //tells us sound wolf makes when gets shot
		//many states- could be in more than one state
	}

}

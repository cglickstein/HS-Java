//public class clock. there is no main
public class clock 
{
	//these are our instance variables
	private int hr; //store hour
	private int min; //store mins
	private int sec;//store secs
	//why do as private? we don't want program calling clock to be able to go in and change vars
	//we want programming callling clock to use a mehtod to change hours, mins, and secs= security
	
	//Default Constructor 
	//PostCondition: hr=0, min=0, sec=0;
	
	//new creates a new instance of this object and once we do that, set hrs, mins, and secs to 0
	
	//constructor and class has same name (build)
	public clock() 
	{
		hr=0;
		min=0;
		sec=0;
	}
	//testProgClock which has method will test clock
	//empty so create clock but
	//Constructor with parameters to set the time. the time is set according to parameters of what we sent it
	//PostConditon: hr=hours, min=minutes, sec=seconds
	//constructor called same name as class again 
	public clock(int hours, int minutes, int seconds)
	{
		setTime(hours, minutes, seconds);
	}
	//Method set the time MUTATOR MEHOD/SETTER- setting instance variables
	//the time is set according to the parameters 
	//PostConditon: hr=hours, min=minutes, sec=seconds
	//just changing instance variables but not sending anything back
	public void setTime(int hours, int minutes, int seconds)
	{ 
		if(hours>=0 && hours<24)
			hr=hours;
		else
			hr=0;
		if(minutes>=0 && minutes<60)
			min=minutes;
		else
			min=0;
		if(seconds>=0 && seconds<60)
			sec=seconds;
		else
			sec=seconds;
		
	}
	//getter methods gets/returns instance variables so wont be void. getting access to methods
	public int getHours()
	{
		return hr;
	}
	
	public int getMinutes()
	{
		return min;
	}
	public int getSeconds()
	{
		return sec;
	}
	
	public void printTime()
	{
		//want two digits
		if (hr<10)
			System.out.print("0");
		System.out.print(hr+":");
		if (min<10)
			System.out.print("0");
		System.out.print(min+":");
		if (sec<10)
			System.out.print("0");
		System.out.print(sec);
	}
	
	public void incrementSeconds()
	{
		sec++;
		if (sec>59)
		{
			sec=0;
			incrementMinutes();
		}
	}
	
	public void incrementMinutes()
	{
		min++;
		if (min>59)
		{
			min=0;
			incrementHours();
		}
	}
	
	public void incrementHours()
	{
		hr++;
		if(hr>23)
			hr=0;
	}
	public boolean equals(clock otherClock) //have class called clock so thats data type
	{
		return(hr==otherClock.hr && min==otherClock.min && sec==otherClock.sec);
	}
	//myClock.equals(yourClock) --> hour from myClock. compare min from myClock to min from yourClock, here  called otherClock
	
	public void makeCopy(clock otherClock) //send in another clock to make copy
	//newClock.makeCopy(myClock) --> copy hours 
	
	{
		hr=otherClock.hr;
		min=otherClock.min;
		sec=otherClock.sec;
	}
	//Method to return a copy of an item
	//Postcondition: a copy of the object is created and a reference of the copy is returned
	public clock getCopy()
	{
		clock temp= new clock(); //making new instance of the clock inside the clock class
		temp.hr=hr;
		temp.min=min;
		temp.sec=sec;
		return temp;
	}
	
	public String toString() //use this header
	{
		return "at the tone the time will be"+ getHours()+":"+getMinutes()+" and "+getSeconds();
	}
}


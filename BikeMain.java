/*In the real world, you'll often find many individual objects all of the same kind. There may be thousands of other bicycles in existence, all of the same make and model. Each bicycle was built from the same set of blueprints and therefore contains the same components. In object-oriented terms, we say that your bicycle is an instance of the class of objects known as bicycles. A class is the blueprint from which individual objects are created.*/ 

 
class Bike
  {
  	String name;
  	int speed;
  	String model;
  	void nameOfBike(String name)
  	{
  		this.name=name;
	  }
	  void speedOfBike(int speed)
	  {
	  	this.speed=speed;
	  }
	  void modelOfBike(String model)
	  {
	  	this.model=model;
	  }
	  void printBike()
	  {
	  	System.out.println("nameOfBike="+name);
	    	System.out.println("speedOfBike="+speed);
				System.out.println("modelOfBike="+model);	
	  }
  }
  class Main
  {
  	public static void main(String args[])
  	{
  		Bike b1=new Bike();
  		     b1.nameOfBike("Splender +");
  		     b1.speedOfBike(50);
  		     b1.modelOfBike("ZLX-2023");
  		     b1.printBike();
  		     System.out.println("<----------This is the second bike description as per as possible----------->");
  	    Bike b2=new Bike();
  	         b2.nameOfBike("Honda shine");
  		     b2.speedOfBike(50);
  		     b2.modelOfBike("SLE-2018");
  		     b2.printBike();
	  }
  }
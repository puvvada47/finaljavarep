package finalljava;

final class Bike{                   //final class cannot be extended by someother class(sub classes)
	  final int speed=50;
	  final void run(){
		 // speed=500;//final variable cannot be overrided
		  System.out.println("running");}  
	}  
	     
	 /* class Finalhonda extends Bike{  
	   void run(){System.out.println("running safely with 100kmph");}  //cannot override the final method
	     
	   public static void main(String args[]){  
	   Finalhonda honda= new Finalhonda();  
	   honda.run();
	   }  
	} */
	 
	 
	 
	 //final class is used to stop inheritance
	 //final method is used to avoid the overrride method
	 //final variable is used to make variable constant

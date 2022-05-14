package finalljava;

 class Bikee{                   //final class cannot be extended by someother class(sub classes)
	   int speed=50;
	   void run(){
		 // speed=500;//final variable cannot be overrided
		  System.out.println("running the parent class");}  
	}  
	     
	 public class CopyOfFinal extends Bikee{  
	   void run(){
		   super.run();
		   System.out.println("running safely with 100kmph");}  //cannot override the final method
	     
	   public static void main(String args[]){  
		   Bikee honda= new CopyOfFinal();  
	   honda.run();
	   }  
	} 
	 
	 
	 
	 //final class is used to stop inheritance
	 //final method is used to avoid the overrride method
	 //final variable is used to make variable constant

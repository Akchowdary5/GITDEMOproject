


	import java.util.Scanner;

	public class Rectangle_constructor {
	int l , b;
	Scanner scan;

	public Rectangle_constructor() 
	{
		Scanner scan = new Scanner(System.in);
		int l =scan.nextInt();
		
		int b =scan.nextInt();
		System.out.println("im constructor wihtout paramter");
	}
	public Rectangle_constructor(int l ,int b) 
	{
		
		this.l= l;       //this.i is global variable and this.l= l makes local variable
	    this.b=b;
	    System.out.println("im constructor with paramter");
	}
	public void area() {
		
		System.out.println("area "+ l*b);
	}
	// non static method so we are calling the area method so no issue becasue of non static 8 to  11 line
	//{
	//area();
	//}	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		//	area();	  nhere we go error because of inside static method we cant call non static method
		Rectangle_constructor object = new Rectangle_constructor();
		//	Rectangle_constructor object1 = new Rectangle_constructor(2 , 30); //for with parameters constructor we use this method 
			 	object.area();
			//object1.area();
		// 	object.scan.next();  // Exception in thread "main" java.lang.NullPointerException
			
		}
		

	}

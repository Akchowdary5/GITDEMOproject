import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 System.out.println("Please enter the a value");
int a = scan.nextInt();
if(a%2==0)
{
	System.out.println("Entered value is even");
	
}
else {
	System.out.println("Entered value is odd");
}
	}

}

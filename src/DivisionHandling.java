import java.util.Scanner;

public class DivisionHandling {
    
        // TODO: Read two integers a and b
        
        // TODO: Enclose the division in a try block
        
        // TODO: Catch ArithmeticException
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.print(c);
		}
		catch(ArithmeticException e){
			System.out.print("Divide by zero error");
		}
      	}  
}

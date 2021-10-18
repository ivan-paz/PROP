import java.util.Scanner;  
    
class AssertionExample{
	public static void main( String args[] ){
	       	Scanner scanner = new Scanner( System.in );  
		System.out.print("Introduce tu edad ");  
		
		int value = scanner.nextInt();
		// usamos la clausula assert para "comprobar una condición"
		assert value>=18:" Not valid";

		System.out.println("value is "+value);  
	}   
}  
  

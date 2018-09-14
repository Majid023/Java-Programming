import java.util.Scanner;

public class InputFromUser {

  public static void main(String... args) {
    
     System.out.println("Enter two number for Adding\n");
	
     Scanner kbd = new Scanner(System.in);

     int num1 = kbd.nextInt();
     int num2 = kbd.nextInt();

     int sum = num1 + num2;

     System.out.println("Sum of value one and value two is " + sum);
  }
}
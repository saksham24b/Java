import java.util.Scanner;

public class Greet{

	public static void main(String[] args){
		try(var io = new Scanner(System.in)){
			System.out.println("What is your name? ");
			var name = io.nextLine();
			System.out.println("Hello, " + name + ".");
		}
	}
}

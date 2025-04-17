import java.util.Scanner;
import java.util.List;

public class Percentage {

	private static int getMarks(String name,Scanner io) {
		System.out.print(name + ": ");
		var marks = io.nextInt();
		return (marks < 0) ? 0 : (marks > 100 ? 100 : marks);
	}

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		var subjects = List.of("English","Maths","Physics","Chemistry","Computer Science");
		var totalMarks = subjects.stream().mapToInt(s -> getMarks(s,io)).sum();
		System.out.println("Percentage: " + (totalMarks / subjects.size()));
	}
}


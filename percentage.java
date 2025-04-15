import java.util.Scanner;

public class percentage{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("English: ");
	float eng = sc.nextFloat();
	System.out.print("Maths: ");
        float math = sc.nextFloat();
	System.out.print("Physics: ");
        float physics = sc.nextFloat();
	System.out.print("Chemistry: ");
	float chemistry = sc.nextFloat();
	System.out.print("Computer Science: ");
	float cs = sc.nextFloat();
	float sum = eng + math + physics + chemistry + cs;
	float percent = (sum/5);
	System.out.print("Total Percentage: ");
	System.out.println(percent);
	}
}


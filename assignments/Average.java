package assignments;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter no. of students: ");
            int n = sc.nextInt();
            System.out.println("Enter marks of students in Physics.");
            float [] marks = new float[n];
            for(int i=0; i<n; i++){
                System.out.printf("Student %d: ",i+1);
                marks[i]=sc.nextFloat();
            }
            System.out.printf("Average: %.2f",average(marks));
        }
    }
    public static float average(float array[]){
        float sum=0;
        for(float elements:array){
            sum += elements;
        }
        float avg = sum/array.length;
        return avg;
    }
}

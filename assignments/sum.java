package assignments;
import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter no. of elements: ");
            int n = sc.nextInt();
            float [] numbers;
            numbers = new float[n];
            System.out.print("Enter "+n+" elements with space: ");
            for(int i=0;i<n;i++){
                numbers[i] = sc.nextFloat();
            }
            float sum = 0;
            System.out.print("You entered: ");
            for(float elements: numbers){
                System.out.print(elements+" ");
                sum+=elements;
            }
            System.out.println();
            System.out.println("Total sum: "+ sum);
            System.out.print("Enter number to find: ");
            float find = sc.nextFloat();
            int index = (search(find,numbers));
            if(index!=-1){
                System.out.println("Number found at "+index);
            }
            else{
                System.out.println("Number not found.");
            }

        }
    }
    public static int search(float x, float[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]==x){
                return i;
            }
        }
        return -1;
    }
}
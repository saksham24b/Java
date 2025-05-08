package assignments;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("No. of elements: ");
            int n = sc.nextInt();
            int [] elements = new int[n];
            System.out.println("Enter elements with space:");
            for(int i=0;i<n;i++){
                elements[i]=sc.nextInt();
            }
            int max=0;
            int min=elements[0];
            for(int element:elements){
                if(element>max){
                    max=element;
                }
                if(element<min){
                    min=element;
                }
            }
            System.out.printf("Max: %d\n",max);
            System.out.print("Min: "+min);
        }
    }
}

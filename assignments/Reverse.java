package assignments;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("No. of elements: ");
        int n = sc.nextInt();
        int []array= new int [n];
        System.out.println("Enter elements with space:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Reversed elements:");
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
}

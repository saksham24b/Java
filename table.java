import java.util.Scanner;

public class table{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Table of: ");
            int table = sc.nextInt();
            int sum = 0;
            for(int i=10; i>=1; i--){
                System.out.printf("%d x %d = %d\n", table,i,table*i);
                sum+=table*i;
            }
            System.out.println("Total sum: "+sum);
        }
    }
}
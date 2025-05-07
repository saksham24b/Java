import java.util.Scanner;

public class Sum{
    public static void main(String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Start: ");
            int start = sc.nextInt();
            System.out.print("End: ");
            int end = sc.nextInt();
            int sum = 0;
            while(start<=end){
                if(start%2==0){
                    sum+=start; //(sum = sum + start)!=(start+=sum) 
                }
                start++;
            }
            System.out.printf("Sum of even num: %d", sum);
        }
    }
}
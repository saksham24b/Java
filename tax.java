import java.util.Scanner;

public class tax{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Income: ");
        int salary = sc.nextInt();
        int tax = calculate_tax(salary);
        System.out.printf("Tax: %d%%\n",tax);
        float total_tax = percent(salary, tax);
        System.out.printf("Total tax to be paid: %.2f", total_tax);
        sc.close();  
    }
    

    public static  int calculate_tax(int income){
        final int lakh = 100 * 1000;
        if(income<2.5 * lakh){
            return 0;
        }
        if(income<=5*lakh){
            return 5;
        }
        if(income<=10*lakh){
            return 20;
        }
        return 30;
         
    }

    public static float percent(int income, int percent){
        float total_tax = (percent/100.0f)*income;
        return total_tax;
    }
}
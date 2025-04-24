import java.util.Scanner;

public class result{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Total: ");
        int total = sc.nextInt();

        System.out.print("Subject1: ");
        float m1 = sc.nextFloat();
        float p1 = percent(m1,total);

        System.out.print("Subject2: ");
        float m2 = sc.nextFloat();
        float p2 = percent(m2,total);

        System.out.print("Subject3: ");
        float m3 = sc.nextFloat();
        float p3 = percent(m3, total);

        if(p1 >= 33.0f && p2 >= 33.0f && p3 >= 33.0f){
            float percentage = percent((m1+m2+m3), total*3);
            if(percentage>=40.0f){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
            System.out.printf("Percentage: %.2f%%", percentage);
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
        
        
    }
    public static float percent(float marks, float total){
        float percent = (marks/total)*100;
        return percent;
    }
}
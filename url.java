import java.util.Scanner;

public class url{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("URL: ");
        String url = sc.nextLine();
        if(url.contains(".com")){
            System.out.println(".com -> Commercial Website");
        }
        if(url.contains(".org")){
            System.out.println(".org -> Organization Website");
        }
        if(url.contains(".in")){
            System.out.println(".in -> Indian Website");
        }
        sc.close();
    }
}
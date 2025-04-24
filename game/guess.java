import java.util.Scanner;

public class guess {
    public static void main(String[] arg){
        System.out.println("Guess the number challenge!");
        System.out.println("You wil get only 10 tries.");
        Scanner sc = new Scanner(System.in);

        int guess = (int) (Math.random()*100);
        boolean win = false;
        
        for(int i=0; i<10; i++){
            System.out.print("Try " + (i+1) + ": ");
            int num = sc.nextInt();
            if(num==guess){
                System.out.println("You guessed it right!");
                win = true;
                break;
            }
            if(num>guess){
                System.out.println("It is greater than the number. Try again!");
            }
            else if(num<guess){
                System.out.println("It is less than the number. Try again!");
            }
            else{
                System.out.println("Wrong input.");
            }
        }

        if(!win){
            System.out.println("You lost.");
        }
    
    }
}

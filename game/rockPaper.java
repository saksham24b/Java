import java.util.Scanner;

public class rockPaper{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissors!!");
        System.out.println("Choose from following:");
        System.out.println("1: (rock)");
        System.out.println("2: (paper)");
        System.out.println("3: (scissor)");

        System.out.println("_____________________");

        int wins = 0;
        int losses = 0;
        int ties = 0;
        int round = 1;

        while(wins<3 && losses<3){
            
            System.out.printf("Round %d: Enter ur choice(1-3): ",round);
            int input = sc.nextInt();

            if(input>=1 && input<=3){
                
                String userChoice = choose(input);
                String botChoice = bot(3);

                System.out.printf("You: %s\n", userChoice);
                System.out.printf("Bot: %s\n", botChoice);
                
                if(userChoice==botChoice){
                    System.out.println("Tie!");
                    ++ties;
                }
                else if(input==1 && botChoice.equals("(scissor)") || input ==2 && botChoice.equals("(rock)") || input ==3 && botChoice.equals("(paper)")){
                    System.out.println("You Wins!");
                    ++wins;
                }
                else{
                    System.out.println("Bot wins!");
                    ++losses;
                }
                round++;
                System.out.println();
                System.out.println("Current Scorecard:");
                System.out.printf("|You: %d |Bot: %d |Ties: %d |\n", wins, losses, ties);
                System.out.println("_____________________");

            }
            
        }sc.close();
        if(wins==3){
            System.out.println("Congratulations! You won the game!");
        }
        else{
            System.out.println("Game Over!");
            System.out.println("You lost! Try again.");
        }
        System.out.println("Final Scorecard:");
        System.out.printf("|You: %d |Bot: %d |Ties: %d |\n", wins, losses, ties);
    }
    public static String choose(int num){
        switch (num){
            case 1:
            return "(rock)";
            case 2:
            return "(paper)";
            case 3:
            return "(scissor)";
            default:
            return "Invalid";
        }
    }
    public static String bot(int range){
        int num = (int)(Math.random()*range)+1;
        return choose(num);
    }
}
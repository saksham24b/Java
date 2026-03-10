import java.util.*;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 5;

        int [][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Element to be searched: ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==search){
                    System.out.print(search + " found at "+i+","+j);
                    found =true;
                }
            }
        }
        if(!found){
            System.out.print(search+" not found in matrix");
        }
    }
    
}

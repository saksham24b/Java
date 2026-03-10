import java.util.*;

public class Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total elements: ");
        int size = sc.nextInt();
        int elements[]=new int[size];
        System.out.println("Enter elements below");

        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }

        System.out.print("Element to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for(int i=0;i<size;i++){
            if(elements[i]==search){
                System.out.print(elements[i]+" found at "+i);
                found = true;
                break;
            }
            else{
                found = false;
            }
        }
        if(!found){
            System.out.print(search+" not found in array");
        }
        

    }
}
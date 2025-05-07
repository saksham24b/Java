public class pattern{
    public static void main(String[] arg){
        int rows = 5;
        for(int x=0; x<rows; x++){
            for(int y=0; y<rows-x; y++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}
import java.util.Scanner;
public class string {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.printf("Hello %s\n", name); 
        //length
        System.out.printf("Length: %d\n",name.length());
        //Lowercase
        String lower = name.toLowerCase();
        System.out.printf("Lower case: %s\n", lower);
        //Uppercase
        String upper = name.toUpperCase();
        System.out.printf("Upper case: %s\n", upper);
        //Substring
        String substring = name.substring(2);
        System.out.printf("Substring: %s\n", substring);
        //Replace
        String replace = name.replace('h','s');
        System.out.printf("Replace h: %s\n", replace);
        //startswith
        System.out.printf("Start with Sak? %s\n", name.startsWith("Sak"));
        //charAt
        System.out.printf("Character at index 3: %s\n", name.charAt(3));
        //indexOf
        System.out.printf("Index of character 's': %d\n", name.indexOf("s"));
        //equals
        System.out.printf("Is it equal to sAkshaM: %s\n", name.equalsIgnoreCase("sAkshaM"));
        //Escape sequence
        System.out.printf("\\ is used to escape sequence like this \"");
        sc.close();
    }
}
 
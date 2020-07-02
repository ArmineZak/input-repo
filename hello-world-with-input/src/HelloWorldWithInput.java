import java.util.Scanner;

public class HelloWorldWithInput {
    public static void main(String[] args) {

        //Using Scanner for getting input from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hello world, please.");
        String s = sc.nextLine();
        System.out.println("You entered:  " + s);
    }
}

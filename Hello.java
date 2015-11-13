import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello " + name + ". I have come for your electrons.");
    }
    
}

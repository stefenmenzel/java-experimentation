import java.util.Scanner;

public class HelloWorld{
    public static Scanner scanner2 = new Scanner(System.in);
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username;
        String petname;

        System.out.println("Hello, World");
        System.out.println("Enter your name: ");
        username = scanner.next();

        System.out.println("Enter your pet's name: ");
        petname = scanner2.next();

        System.out.println(String.format("%s, your pet is %s", username, petname));

        System.out.println("The number is: " + getNumber(3));
    }

    public static int getNumber(int num){
        return num;
    }
}
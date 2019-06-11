import java.util.Scanner;

public class fizzBuzz{
    public static void main(String[] args){
        fizzBuzz();
    }

    public static void fizzBuzz(){
        Scanner scanner = new Scanner(System.in);
        int num;
        String output;

        System.out.println("Please enter an integer");
        num = Integer.parseInt(scanner.next());

        output = calcFizzBuzz(num);

        System.out.println(output);
    }

    public static String calcFizzBuzz(int num){
        if(num % 15 == 0){
            return "Fizz Buzz";
        }
        else if(num % 3 == 0){
            return "Fizz";
        }
        else if(num % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(num);
    }
}
import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int factorialNum;
        int factorialValue;

        System.out.println("Please Enter an integer to calculate it's factorial");
        factorialNum = Integer.parseInt(scanner.next());

        factorialValue = calcFactorial(factorialNum);
        System.out.println("your integer factorial is: " + factorialValue);
    }

    public static int calcFactorial(int factorialNum){
        int totalValue = 1;
        for (int i = 1; i <= factorialNum; i++){
            totalValue *= i;
        }
        return totalValue;
    }
}
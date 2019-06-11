import java.util.Scanner;
import java.util.*;

public class baconianCipher{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> alphabet = new HashMap<String, Integer>(){{
            put("a",0); put("b", 1); put("c",2); put("d",3); put("e", 4);
            put("f", 5); put("g", 6); put("h", 7); put("i", 8); put("j", 8);
            put("k", 9); put("l", 10); put("m", 11); put("n", 12); put("o", 13);
            put("p", 14); put("q", 15); put("r", 16); put("s", 17); put("t", 18);
            put("u", 19); put("v", 19); put("w", 20); put("x", 21); put("y", 22);
            put("z", 23);
        }};        
        String stringToConvert = "";
        String outputString = "";

        System.out.println("Please enter a string you'd like put through the baconian cipher");
        stringToConvert = scanner.next();
        for(int i = 0; i < stringToConvert.length(); i++){
            System.out.println("letter to check: " + stringToConvert.charAt(i));
            int charValue = alphabet.get(String.valueOf(stringToConvert.charAt(i)));
            outputString = outputString + printBinary(charValue);            
        }
        // printBinary(0);
        // System.out.println(Integer.toBinaryString(0x0100 | 3).substring(1));

        System.out.println("your string ciphered is: " + outputString);
    }

    public static String printBinary(int num){
        String binary = "";
        for(int i = 0; i < 5; ++i, num/=2){
            switch (num % 2) {
                case 0:
                    binary = "0" + binary;
                    break;
                case 1:
                    binary = "1" + binary;                
            }
        }
        return printCipherLetter(binary);
        // System.out.println(binary);
    }

    public static String printCipherLetter(String binary){
        String cipher = "";
        for(char letter : binary.toCharArray()){
            if(letter == '0'){
                cipher += "a";
            }
            else if(letter == '1'){
                cipher += "b";
            }            
        }
        System.out.println(cipher);
        return cipher;
    }
}
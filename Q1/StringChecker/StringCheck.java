package Q1.StringChecker;

import java.util.Scanner;

public class StringCheck {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String input1 = scanner.nextLine();
        System.out.print("Please Enter the Second String: ");
        String input2 = scanner.nextLine();
        scanner.close();
        if (input1.contains(input2)){
            System.out.println("String 2 is a substring of String 1");
        }
        else {
            System.out.println("String 2 is not a substring of String 1");
        }

    }
}

package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        //there is no direct method for the char data type in scanner class
        //we use a work-around we first use the next method to take a String from the user and from that String
        //we extract the first letter by passing 0 to the charAT() method.
        char gender=scanner.next().charAt(2);
        System.out.println("you entered "+gender);

    }
}

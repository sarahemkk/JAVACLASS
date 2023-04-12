package Class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        //in a while loop ask the user to enter numbers and if the user enters any number other than -1
        //print "hello world" and keep on asking the user for a number
        // the moment the user enters the number -1 the loop should stop
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter a number");
       int number= scanner.nextInt();
       while(number!=-1){
           System.out.println("Try again");
           System.out.println("please enter a number");
           number=scanner.nextInt();
       }
    }
}

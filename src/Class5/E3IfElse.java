package Class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        /*
        ask the user for their age and based on the value of age write
        an if-else condition. If age is <18 print you cant drive otherwise we have to print you can drive
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you?");
        int age= scanner.nextInt();

        if (age <18){
            System.out.println("you cant drive");
        }else {
            System.out.println("you can drive");
        }

    }
}

package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
         //below code helps us get any type f data from the console
        Scanner input= new Scanner(System.in);
        //print the text inside the ""in the console
        System.out.println("Is it time for break true/false");
        /*
        boolean isBreak=> we are creating a variable of type boolean and calling isBreak
        input=> is also a variable of type scanner
        nextBooLean()=> this is a method that helps us take boolean type data from the keyboard
        = => equal to sign will store that value inside the isBreak variable
         */
        boolean isBreak= input.nextBoolean();
        if (isBreak){
            System.out.println("lets have a break");// true/false
            /*
            if (isBreak)
             */
        } else{
            System.out.println("Lets continue the class");
        }
    }
}

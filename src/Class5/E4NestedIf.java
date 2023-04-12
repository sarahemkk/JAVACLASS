package Class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        /*create a variable (money) store the value 20000 inside that variable
        write if-else condition, if the money is greater than 100000 program should check another condition
        for example: it should check what today's date is. if the day is Sunday it should say lets go shopping
         */

        int money= 20000;
        String day="Sunday";
        if(money>10000){
            if(day.equals("Sunday")){
                System.out.println("lets go shopping");
            }

        }
    }
}

package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //to print all whole numbers from a starting point to an ending point
        // ask the user for starting and ending number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point and ending point");
        int start=scanner.nextInt();
        int end= scanner.nextInt();


        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number++;


        }
    }
}

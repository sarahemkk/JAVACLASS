package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter name");
        String name= scanner.next();

        if(name.equals("Sarah")){
            System.out.println("Mac User");
        } else if (name.equals("Nawal")) {
            System.out.println("LA");
        } else if (name.equals("Maysa")) {
            System.out.println("CA");
        }

    }
}

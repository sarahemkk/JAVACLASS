package class2;

public class WholeNumbersDemo {
    public static void main(String[] args) {
        /*
        byte => data type
        age=> variable
        = => store the number in the variable
        50 => number that we want to store
        ; => part of syntax just like in english we end sentence with  . we end java with ;
         */
        byte age =100;
        System.out.println(age);
        short noOfApples=300;
        System.out.println(noOfApples);
        // int is the most widely use data type to store whole numbers
        int bankBalance=1000000;
        System.out.println(bankBalance);
        /*
        all the whole numbers by default are treated as int whenever we have to store a number which
        is beyond the range of int we have to explicitly write the letter 'L' at the end to tell java we
        are dealing with a special very large number
         */
        long catInHat=25_25_25_25_25L;
        System.out.println(catInHat);


    }
}

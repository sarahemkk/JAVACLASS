package class3;

public class E9ShortHandOperators {
    public static void main(String[] args) {
        // to create a container of type int and store the number 10 in it
        int number=10;
        // pick whatever is stored in number container and add 20 to that value and
        //store the results back to number variable
        //number= number+20; //30
        //we are asking java to add 20 to the previous value of number variable
        number=+20;
        System.out.println(number);
    }
}

package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        /*
        create an array store 10,50,60,45,100 then print elements which are present on odd indexes
        expected output should be 50 45
         */
       int [] num={10,50,60,45,100};
        for (int i = 1; i < num.length; i+=2) {
            System.out.println(num[i]);

        }

    }
}

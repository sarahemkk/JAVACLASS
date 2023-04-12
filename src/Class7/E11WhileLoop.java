package Class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        int counter=100;
        while (counter>=1){
                System.out.print(counter+" ");
            counter--;
        }
        counter=20;
        System.out.println();
        while (counter<=100){
            System.out.print(counter+" ");
            counter+=2;
        }
        counter=100;
        System.out.println();
        //so that we can see the next output on a new line
        while (counter>=1){
            if (counter%2!=0){
                System.out.print(counter+"  ");
                //odd numbers when we divide by 2 gives 1 as a remainder
            }
            counter--;
        }
    }
}

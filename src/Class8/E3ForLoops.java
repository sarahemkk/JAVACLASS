package Class8;

public class E3ForLoops {
    public static void main(String[] args) {
        //write a loop to add all the even numbers from 1 to 30
         int sum=0; //creating a variable to hold the sum
        for ( int j =1; j<=30 ; j++) {
        if (j%2==0){ //checking if a number is even
            sum=sum+j; // sum+j;// adding all the even numbers to the sum variable one by one
        }
        }
        System.out.println(sum);
    }
}

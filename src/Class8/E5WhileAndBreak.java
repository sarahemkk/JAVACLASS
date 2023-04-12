package Class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //create a boolean variable summer store true in it
        //then write a loop that writes a loop that runs as it is summer
        //create a temperature variable store 85
        //inside the loop check the temp if it is less than 100 print "its good i enjoy summer"
        //as soon as the temp exceeds 100 print "its too hot" and add a break

        boolean summer=true;
        int temp=85;
        while (summer){
            if (temp<100){
                System.out.println("its good I enjoy summer");
            }
            else {
            System.out.println("its too hot");
            break;
        }
          temp=temp+2;
    }}
}

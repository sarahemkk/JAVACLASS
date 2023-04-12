package Class8;

public class E4BreakKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;//can only be used within the "if" condition //terminates the loop after x iterations
            }
            System.out.println(i);
        }
    }
}

        /*
         int sum=0;

        for (int i= 0;i < 50; i++){
            sum=sum+1;
            if(sum>=300);{
            System.out.println(i);
            break; */

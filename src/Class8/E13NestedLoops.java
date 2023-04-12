package Class8;

public class E13NestedLoops {
    /*
    2 2 2 2
    3 3 3 3
    4 4 4 4
     */
    public static void main(String[] args) {
        {
            for (int i = 0; i <5; i++) {
                for (int j = 1; j <=5 ; j++) {
                    System.out.print(i+j+" ");

                }
                System.out.println();

            }
        }
    }
}



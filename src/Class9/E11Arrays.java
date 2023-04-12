package Class9;

public class E11Arrays {
    public static void main(String[] args) {{
        /*
        There are two ways of creating arrays
        new int[5]; => create an array of integers with size 5
         */
        int [] numbers=new int[5];
        numbers [2]=50;
        numbers[0]=100;
        for (int number : numbers) {
            System.out.println(numbers);

        }

        }

    }
}

import org.w3c.dom.ls.LSOutput;

public class SeventhClass {
    public static void main(String[] args) {
        //Print numbers from 1 - 10

        //Initialize variable
        int number = 200;

        /*
        print value
        increment
        print
        increment
         */

        do {
            System.out.println(number);
            number += 2;
        } while (number <= 100);
        System.out.println("After while loop");
    }
}

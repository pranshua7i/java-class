import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SeventhClassSecondFile {
    public static void main(String[] args) {
        //1. Prompt user for number
        //2. Print if number is even or odd
        //3. Repeat the above till user types -1

        Scanner scanner = new Scanner(System.in);
        int usersNumber = 0;

        while(usersNumber != 1) {

            System.out.println("Enter a Number : ");
            usersNumber = scanner.nextInt();

            if (usersNumber % 2 == 0) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }
        System.out.println("Thanks, try again sometime!");
    }
}

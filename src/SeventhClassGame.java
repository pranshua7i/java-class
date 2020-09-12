import java.util.Scanner;

public class SeventhClassGame {
    public static void main(String[] args) {
        int numberToGuess = 7; //use math.random here
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != numberToGuess){
            guess = scanner.nextInt();
            attempts ++;
        }

        System.out.println("You guessed it in " + attempts + " attempts!");
    }
}

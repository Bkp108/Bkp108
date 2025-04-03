// package JAVA.T.8_EXP_2_RockPaperScisser;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScisser {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"rock", "paper", "scissors"};
        int computerChoice = random.nextInt(3); // generate a random number between 0 and 2
        
        System.out.print("Enter your choice (rock/paper/scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();
        
        System.out.println("Computer choice: " + options[computerChoice]);
        
        // determine the winner
        if (userChoice.equals(options[computerChoice])) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && options[computerChoice].equals("scissors"))
                || (userChoice.equals("paper") && options[computerChoice].equals("rock"))
                || (userChoice.equals("scissors") && options[computerChoice].equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    
    }

}
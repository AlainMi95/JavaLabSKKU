package lab_01;

import java.util.Random;
import java.util.Scanner;

/**
 * This class is a lab_01.KaiBaiBo, or a rock paper scissor game.
 */
public class KaiBaiBo {
    private int winnerCount=0;

    /**
     * lab_01.Main method of the lab_01.KaiBaiBo class. This method starts the game, and runs its needed methods.
     * @param args
     */
    public static void main(String[] args){
        KaiBaiBo kaiBaiBo = new KaiBaiBo();
        kaiBaiBo.playKaiBaiBo();
    }

    private void playKaiBaiBo(){
        System.out.println("Let's play Kai-Bai-Bo (scissors, rock, paper)");

        playRound(1);
        playRound(2);
        playRound(3);

        checkGameWinner();
    }

    private void checkGameWinner(){
        if(winnerCount>0) {
            System.out.println("You Won the Game!");
        }else if(winnerCount==0) {
            System.out.println("Its a draw!");
        }else {
            System.out.println("Computer won the Game!");
        }
    }

    private void playRound(int roundNumber){
        System.out.println("Round "+roundNumber);
        System.out.println("1. Kai (scissors)");
        System.out.println("2. Bai (rock)");
        System.out.println("3. Bo (paper)");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userChoiceInput = scanner.nextLine();
        int yourChoice = Integer.parseInt(userChoiceInput);

        System.out.println("You: "+changeNumberToKaiBaiBo(yourChoice));

        Random randomGenerator = new Random();
        int computerChoice = randomGenerator.nextInt(3)+1;

        System.out.println("Computer: "+changeNumberToKaiBaiBo(computerChoice));
        System.out.println("Winner:"+checkRoundWinner(yourChoice, computerChoice));
        System.out.println("================");
    }

    private String changeNumberToKaiBaiBo(int number){
        if(number == 1) {
            return "scissors";
        }else if(number==2) {
            return "rock";
        }else {
            return "paper";
        }
    }

    private String checkRoundWinner(int userChoice, int computerChoice) {
        if(userChoice == 1){
            if(computerChoice==3){
                winnerCount+=1;
                return "you won this round!";
            }else if(computerChoice==1){
                return "draw";
            }else {
                winnerCount-=1;
                return "computer won this round!";
            }
        }else if(userChoice == 2) {
            if (computerChoice == 1) {
                winnerCount+=1;
                return "you won this round!";
            } else if (computerChoice == 2) {
                return "draw";
            } else {
                winnerCount-=1;
                return "computer won this round!";
            }
        }else if(userChoice == 3){
            if(computerChoice==2){
                winnerCount+=1;
                return "you won this round!";
            }else if(computerChoice==3){
                return "draw";
            }else {
                winnerCount-=1;
                return "computer won this round!";
            }
        }
        return "";
    }
}
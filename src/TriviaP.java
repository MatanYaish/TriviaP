import java.util.Scanner;

public class TriviaP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String triviaBoard[][] = new String[5][3];

        triviaBoard[0][0] = "Who was the 5th president of the USA?";
        triviaBoard[1][0] = "What do golfers shout to warn other golfers as they hit a shot?";
        triviaBoard[2][0] = "Which city is traditionally said to be built on 7 hills";
        triviaBoard[3][0] = "Abraham Lincoln was assassinated in what year?";
        triviaBoard[4][0] = "Porsche is a brand of car that originated in what country?";


        triviaBoard[0][1] = "<A> Thomas Jeferson\n<B> James Monroe\n<C> James Madison";
        triviaBoard[1][1] = "<A> Fore\n<B> Birdie\n<C> Green";
        triviaBoard[2][1] = "<A> London\n<B> Tokyo\n<C> Rome";
        triviaBoard[3][1] = "<A> 1,823\n<B> 1,898\n<C> 1,865";
        triviaBoard[4][1] = "<A> Germany\n<B> Japan\n<C> France";


        triviaBoard[0][2] = "B";
        triviaBoard[1][2] = "A";
        triviaBoard[2][2] = "C";
        triviaBoard[3][2] = "C";
        triviaBoard[4][2] = "A";


        int money = 100;
        System.out.println("Welcome to The Trivia King !!");
        System.out.println("You currently have: " + money + "$\nFor every question you answer correctly, you will be " +
                "rewarded with 50$\nHowever with any incorrect answer you will lose 50$\n\tGOOD LUCK !!");

        for (int i = 0; i < triviaBoard.length; i++) {
            if (money > 0) {
                System.out.println("Question " + (i + 1) + ":");
                System.out.println(triviaBoard[i][0]);
                System.out.println(triviaBoard[i][1]);
                String answer = scan.next();

                if (answer.equals(triviaBoard[i][2])) {
                    money += 50;
                    System.out.println("GOOD JOB !!\nYou win 50$ !!\nCurrently you have: " + money + "$");
                } else {
                    money -= 50;
                    System.out.println("Sorry... you wrong and currently have: " + money + "$");
                }
            } else {
                i = triviaBoard.length;
                System.out.println("GAME OVER...");
            }
        }
        if (money == 350) {
            System.out.println("YOU ARE THE WINNER ☻☺!!");
        }
    }
}

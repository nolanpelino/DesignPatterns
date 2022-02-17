import java.util.*;

import javax.lang.model.util.ElementScanner14;
/**
 * @author npelino
 */
public class MathGame {
    private static MathGame mathGame ;
    private int score;
    private Random rand;
    private Scanner reader;
    private String [] operands =  {"+", "-", "*", "/"};

    private MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    public static MathGame getInstance(){
        if (mathGame == null) {
           MathGame mathGame2 = new MathGame();
           return mathGame2;
        }
        return mathGame;
    }

    public void play() {
        boolean stillPlaying = true;
        while (stillPlaying) {
            System.out.println("(P)lay or (Q)uit:");
            String answer = reader.nextLine();
            if (answer.equalsIgnoreCase("q")) {
                stillPlaying = false;
                System.out.println("Score: " + score + "\nGoodbye.");
            } else if (answer.equalsIgnoreCase("p")) {
                playRound();
            } else {
                System.out.println("Sorry, you must enter p or q");
            }
        }
    }

    private boolean playRound() {
        int num1 = rand.nextInt(101) + 1;
        int num2 = rand.nextInt(101) + 1;
        int randOp = rand.nextInt(4);
        double answer = manageNums(num1, num2, randOp);
        answer = round(answer, 1);

        System.out.print(num1 + " " + operands[randOp] + " " + num2 + " = ");
        double guess = reader.nextDouble();
        reader.nextLine();

        if (guess == answer) {
            this.score++;
            System.out.println("Correct!");
            System.out.println();
            return true;
        }
        System.out.println("Wrong. The correct answer is " + answer);
        return false;
    }

    private double manageNums(int num1, int num2, int randOp) {
        double n1 = num1;
        double n2 = num2;
        if (randOp == 0) 
            return (n1 + n2);
        else if (randOp == 1)
            return (n1 - n2);
        else if (randOp == 2) 
            return (n1 * n2);
        else
            return (n1 / n2);
    }

    /**
     * @author jpdymond -- Stack Overflow
     * @param double
     * @param int
     * @return double
     */
    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}

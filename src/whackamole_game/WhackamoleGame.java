package whackamole_game;

import java.util.*;

public class WhackamoleGame {
    int score;
    int attemptsLeft;
    char[] moleHoles;

    public WhackamoleGame() {
	this.attemptsLeft = 10;
	this.moleHoles = new char[6];
	Arrays.fill(moleHoles, '*');
    }

    public boolean place(int hole) {
	if (moleHoles[hole] != 'M') {
	    moleHoles[hole] = 'M';
	    return true;
	}
	else {
	    return false;
	}
    }

    public void whack(int hole) {
	if (moleHoles[hole] == 'M') {
	    score++;
	    System.out.println("Hit!");
	}
	else {
	    System.out.println("Miss.");
	}
	attemptsLeft--;
    }

    public void printBoard() {
	String board = "";
	for (char hole : moleHoles) {
	    if (hole != 'M') {
		board += "*";
	    }
	    else {
		board += "M";
	    }
	}
	String[] printArray = new String[2];
	printArray[0] = board;
	printArray[1] = "******";
	String format = "\r%s";
	for(String printBoard : printArray) {
	    System.out.printf(format, printBoard);
	    try {
		Thread.sleep(100);
	    }
	    catch(Exception e) {
	    }
	}
	System.out.println();
    }

    public static void main(String[] args) {
	WhackamoleGame game = new WhackamoleGame();

	System.out.println("Type \"Exit\" to Exit");

	while (game.attemptsLeft > 0) {
	    System.out.println("Score: " + game.score);
	    System.out.println("Attempts Left: " + game.attemptsLeft);

	    Arrays.fill(game.moleHoles, '*');

	    for (int moles = 0; moles < 2; moles++) {
		double random = 6 * Math.random();
		int hole = (int) random;

		if (game.place(hole) == false) {
		    moles--;
		}
	    }

	    game.printBoard();

	    @SuppressWarnings("resource")
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Which hole would you like to whack? ");
	    try {
		int hole = scanner.nextInt() - 1;
		try {
		    game.whack(hole);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("Enter a number between 1 and 6.");
		}
	    }
	    catch(InputMismatchException e) {
		String input = scanner.next();
		if (input.equals("Exit")) {
		    break;
		}
		else {
		    System.out.println("Invalid input.");
		}
	    }
	}

	if (game.attemptsLeft == 0) {
	    System.out.println("No attempts reamaining.");
	    System.out.println("GAME OVER");
	    System.out.println("Final Score: " + game.score);
	}
    }
}

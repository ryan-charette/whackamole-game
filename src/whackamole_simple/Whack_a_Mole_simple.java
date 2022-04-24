package whackamole_simple;

import java.util.*;

/**This program is based on a similar program that I wrote for a university course
 * The code has been simplified and reworked to comply with university's policy on academic integrity
 * The purpose is to display the key learning concepts of the original assignment without sharing my solution to it
 * The original assignment took user input to create any size grid, any number of attempts, and any number of moles
 * The original assignment also used a 2D array, and kept track of a score and high-score
 * Certain advanced concepts, such as Arrays.fill and simplified for loops were not permitted on the original assignment
 */

public class Whack_a_Mole_simple {
    int molesLeft;
    int attemptsLeft;
    char[] moleHoles;

    public Whack_a_Mole_simple() {
	this.attemptsLeft = 4;
	this.moleHoles = new char[6];
	Arrays.fill(moleHoles, '*');
    }

    public boolean place(int hole) {
	if (moleHoles[hole] != 'M') {
	    moleHoles[hole] = 'M';
	    molesLeft++;
	    return true;
	}
	else {
	    return false;
	}
    }

    public void whack(int hole) {
	if (moleHoles[hole] == 'M') {
	    moleHoles[hole] = 'W';
	    molesLeft--;
	    System.out.println("Hit!");
	}
	else {
	    System.out.println("Miss.");
	}
	attemptsLeft--;
    }

    public void printGridToUser() {
	for (char hole : moleHoles) {
	    if (hole != 'W') {
		System.out.print('*');
	    }
	    else {
		System.out.print('W');
	    }
	}
	System.out.println();
    }

    public void printGrid() {
	for (char hole : moleHoles) {
	    System.out.print(hole);
	}
	System.out.println();
    }

    public static void main(String[] args) {
	Whack_a_Mole_simple game = new Whack_a_Mole_simple();

	for (int moles = 0; moles < 3; moles++) {
	    double random = 6 * Math.random();
	    int hole = (int) random;

	    if (game.place(hole) == false) {
		moles--;
	    }
	}

	while (game.attemptsLeft > 0 && game.molesLeft > 0) {
	    System.out.println("Attempts Left: " + game.attemptsLeft);
	    System.out.println("Moles Left: " + game.molesLeft);

	    game.printGridToUser();

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
		    game.printGrid();
		    break;
		}
		else {
		    System.out.println("Invalid input.");
		}
	    }
	}

	if (game.molesLeft == 0) {
	    System.out.println("You Win!");

	}
	if (game.attemptsLeft == 0 && game.molesLeft > 0) {
	    System.out.println("No attempts reamaining.");
	    System.out.println("GAME OVER");
	}
    }
}
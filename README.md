# whack-a-mole-simple

This program is based on a similar program that I wrote for a university course. The code has been simplified and reworked to comply with university's policy on academic integrity. The purpose is to display the key learning concepts of the original assignment without sharing my solution to it. Certain advanced concepts, such as Arrays.fill and simplified for loops were not permitted on the original assignment. 

The original assignment's requirements are listed here:

> In this assignment we will simulate a variant of the classic whack-a-mole game.
Create a class called **WhackAMole**.

> It contains three integer instance variables called **score**, **molesLeft**, and **attemptsLeft**. Make one more instance variable called **moleGrid** which is a 2-dimensional array of chars.

> We will also have you create the following methods in this class.

> **WhackAMole(int numAttempts, int gridDimension)** - Constructor for the game, specifies total number of whacks allowed, and the grid dimension. After reading through the assignment, make sure to initialize the moleGrid with the appropriate character.

> ***boolean* place(int x, int y)** – Given a location, place a mole at that location. Return true if you can. (Also update number of moles left.)         

> ***void* whack(int x, int y)** -  Given a location, take a whack at that location. If that location contains a mole, the score, number of attemptsLeft, and molesLeft is updated. If that location does not contain a mole, only attemptsLeft is updated.

> ***void* printGridToUser()** – Print the grid without showing where the moles are. For every spot that has recorded a “whacked mole,” print out a W, or * otherwise.

> ***void* printGrid()** -  Print the grid completely. This is effectively dumping the 2d array on the screen. The places where the moles are should be printed as an ‘M’. The places where the moles have been whacked should be printed as a ‘W’. The places that don’t have a mole should be printed as *.

> **Putting it all together - main method**
In order to play this game you need to create a main method. 
Begin by creating a 10 by 10 grid where you randomly place the moles. Place a total of 10 moles.
Now allow the user (remember how to use Scanner?) to enter the x and y coordinates of where they would like to take a whack. Tell them they have a maximum of 50 attempts to get all the moles. 
At any point in the game, they can input coordinates of -1, -1 in order to indicate that they are giving up. If the user gives up they get to see the entire grid.  
The game ends if the user is able to uncover all the moles or if the user runs out of attempts. 

The program runs in the console, so if you'd like to test out the game, simply open the file in an IDE and run it. The game randomly generates 3 moles, and hides them amongst 6 holes. You have 4 attempts to find all 3 moles. To target a hole, simply enter an integer 1-6 corresponding to the position of the hole. Unlike traditional whack-a-mole, the moles do not move.

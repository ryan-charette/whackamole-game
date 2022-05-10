# whackamole-game

This program is intended to demonstrate the key concepts and takeaways from a programming assignment completed for a university course. While the idea behind this project is inspired by the original assignment, the execution is entirely different. There are no commonalities between this code and my solution to the university assignment; it is not reasonably possible to derive a solution to the original assignment, in part or in whole, from this code.

This program creates a 6 item array and randomly places 2 moles. The user is briefly shown the mole positions (indicated by 'M') and then can "whack" a hole. If the whacked hole contains a mole, the user gains 1 point. This process repeats 10 times. 

---

The class WhackamoleGame has the following instance variables:

1. int score
2. int attemptsLeft
3. char[] moleHoles

### Constructor:

WhackamoleGame has a constructor. It sets the number of attempts, the size of the playing board, and fills the board with '\*'s.

### Methods

**boolean place(int hole)**

This method places moles at the specified position in the array and ensures that each mole is placed in a unique hole.

**void whack(int hole)**

This method checks if the hole contains a mole, and outputs the appropriate message to the user. It also adjusts score and remaining attempts as necessary.

**void printBoard()**

This method displays the playing area to the user. After 100ms, it stops displaying the locations of the moles.

---

The program runs in the console, so if you'd like to test out the game, simply open the file in an IDE and run it. In order for this to run properly in some IDEs, certain settings will need to be enabled. In Eclipse, "Control character interpretation in Console View" must be enabled. This feature is disabled by default. You can enable it on the Run/Debug > Console preference page.

Please note that the hole positions are indicated 1-6 rather than 0-5.

### Hw 6 lesson 7

**Loops and arrays.**

- [Github Page](https://github.com/moahmadkamel/qa6-java/tree/master/hw-basic-java/hws/src/lesson7)

---

__Task 1:__

The user sets the dimension of a two-dimensional array from the keyboard.

The array is filled with random numbers from 0 to 1000.

It is necessary to create a one-dimensional array consisting of the maximum values of each individual array included in the two-dimensional one.

Display the new resulting array on the screen.

---

__Task 2:__

Write the "target shooting" program.

**Technical requirements:**

• Given a 5x5 square where the program randomly places a target.

• Before the start of the game, the text: All Set is displayed on the screen. Get ready to rumble!.

• The game process itself is processed in an infinite loop.

• The player is asked to enter a line for shooting; the program checks that a number has been entered and that a line has been entered

• is within the playing field (1-5). If the player made a mistake, he offers to enter the number again.

• The player is asked to enter a column for shooting (must pass a similar check).

• After each shot, it is necessary to show the updated playing field in the console. Cells where the player has already shot should be marked as *.

• The game ends when you hit the target. At the end of the game, display the phrase You have won!, as well as the playing field, on the console.

• Mark the affected target as an x.

• The task must be performed using arrays (DO NOT use List, Set, Map interfaces).

Example of output to the console:

[0, 1, 2, 3, 4, 5]
[1, -, *, -, -, -]
[2, -, -, -, -, -]
[3, -, *, -, -, -]
[4, -, -, *, -, -]
[5, -, *, -, -, *]
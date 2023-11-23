### Hw 8 lesson 9

**Methods and Classes.**

- [Github Page](https://github.com/moahmadkamel/qa6-java/tree/master/hw-basic-java/hws/src/lesson9-hw8)

---

__Task 1:__

Create a Computer class with a constructor that accepts the parameters 
Brand type String, price type int, RAM type int, and video card type int.
Override the toString method to display the class object in the next. form:

"PC created.
Name = brand.
Price = price.
Video card = video card capacity.
RAM = Amount of random access memory."

All fields of the Computer class must be private.
Also create public methods to obtain information about the fields of the Computer class.

As well as methods for changing its fields.
Override the equals method and hashCode method for your class.
Make sure that computers are considered the same if they have
The values of the brand, RAM and video card fields are equal.
The values of the fields brand, RAM and video card are equal.
In a separate class, create an object of the computer class and output to the console
information about your property

---

__Task 2:__

Create a Tree class with overloaded constructors.
You need to create a one-dimensional array consisting of maximum values
The Tree class has fields:
String type; int height, int coutOfsticks, String color;

Constructor1 accepting String type as parameters; int height
and setting the coutOfsticks fields to 13,
color "Green".

Constructor2 taking as parameters int height, int coutOfsticks,
String color and assigning a value to the field type "fir".

The default constructor is 3, which assigns height = 350, coutOfsticks = 29,
color = "Yellow".

Constructor4 which takes String type as parameters,
and calls constructor 3 internally.

Create 4 Tree class objects in a separate main class using the 4 created constructors.

---

__Task 3:__

It is necessary to create a converter class that will have methods for converting primitive data types:
method convertToInt; (converts byte, short, int, long, char, float, double, String).
When you enter boolean, it displays a message that the type entered is boolean.

convertToDouble; (converts byte, short, int, long, char, float, double, String).
When you enter boolean, it displays a message that the type entered is boolean.

convertToString; (converts byte, short, int, long, char, boolean, float, double, String).

This class should have only one constructor, in the parameters of which you can specify its name.
And also only one getter method for obtaining information about the name of this converter.

---

__Task 4:__

Create a calculator class.
Create methods in it:
summ, minus, multiply, division.
Addition, subtraction, multiplication and division respectively.
Each method takes two double values as parameters.
And displays the result of the action to the console.

The class also has a start method. Which prints a message to the console that
The calculator is running. And it prompts you to enter an action in your console.

The calculator should only accept the following types of actions:
2+4; - example of addition syntax;
5-6; - example of subtraction syntax;
25*3; - example of multiplication syntax;
34/3; - example of division syntax;

After you enter an action, the response from that action is displayed on the console.
And then a message prompting you to enter an action is displayed again.

If you enter a different syntax, the console returns the following message:
"Enter a valid action."
And then a message prompting you to enter an action is displayed again.

The program closes after entering the Stop command.
Before closing, the following message should be displayed on the console:
"The calculator is closed."
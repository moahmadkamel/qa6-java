### Hw 9 lesson 10

**Mini project "Happy Family"**

- [Github Page](https://github.com/moahmadkamel/qa6-java/tree/master/hw-basic-java/hws/src/hw9)

---

The essence of the project: a description of the family structure, taking into account the fact that each person has blood relatives, and the composition of the family can change over time. Before completing the Collections topic, all homework assignments must be completed using arrays (DO NOT use the List, Set, Map interfaces unless explicitly stated in the assignment). Objects

---

__Task:__

• Create and describe classes: Pet, Human. Create constructors for written classes. Create a Main class and in it create instances of the described classes.
• Make all class fields private.
• Create and describe the Family class. Let's assume that a family can be created by two people who do not separate and can give birth/adopt their children. Children can grow up and leave the family, creating their own.
• Override equals() and hashCode() methods in all project classes.
• In the Family class, add the deleteChild(Human child) method, taking into account the presence of these methods.

---

__Technical requirements:__

• Describe the following fields in the Pet class:

• species, line (dog, cat, etc.)
• nickname
• age
• Trick Level (trickLevel) (an integer from 0 to 100)
• habits (string array)

• Describe and implement the following methods in the Pet class:

• eat (the method displays the message I'm eating!)
• respond (the method displays the message Hello, owner. I am [animal name]. I'm bored!)
• make a domestic abomination (foul) (the method displays a message on the screen You need to cover your tracks well...)

• Describe the following fields in the Human class:

• Name (name)
• Surname
• Year of birth (year), number
• IQ level (iq) (an integer from 0 to 100)
• Pet (Pet object)
• Mother (human object)
• Father (human object)

• Describe and implement the following methods in the Human class:

• greet your pet (greetPet)("Hello, [pet's name]")
• describe your pet (describePet): (display all information about your pet on the screen: "I have [species of animal], it is [animal's age] years old, it is [very cunning]/[almost not cunning]". description of tricks should depend on the level of cunning of the pet, if more than 50 - [very cunning], if less than or equal to 50 - [almost not cunning])

• Redefine the toString() method in both classes;

• The Pet class should output messages of the following type: dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}, where dog is a type of animal;
• The Human class should output messages of the following type: Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock' , age=5, trickLevel=75, habits=[eat, drink, sleep]}}

• In the Pet class, create constructors:

• constructor describing the type of animal and its nickname
• a constructor that describes all fields of the animal
• An empty constructor

• In the Human class, create constructors:

• constructor describing the first name, last name and year of birth
• constructor describing the name, surname, year of birth, father and mother
• a constructor that describes all fields
• An empty constructor

• Declare all fields of existing classes as private. Add getters and setters; refactor existing methods to account for the changes.

• Describe the following fields in the Family class:

• mother (type Human)
father (type Human)
• children (Human array)
• pet pet (Pet type)

• Add getters, setters; redefine toString so that it displays all information about all family members.

• In the Family class, create a constructor:\

• the only condition for creating a new family is the presence of 2 parents, and the parents must have a reference to the current new family, and the family is created with an empty array of children.

• Refactor the Human class taking into account the Family structure:

• Remove from Human all information duplicated in the Family class (Human should only store information that describes itself)
• add the field family (type Family) (now it stores all information about a person's family data)
• add the necessary getters, setters, constructors; remove obsolete constructors and methods; refactor the greet your pet, describe your pet, and feed methods
• Refactor the toString() method. It should output information in the following format: Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}.

• In Family, describe the methods:

• add a child addChild (takes the Human type and adds it to the array of children; adds a reference to the current family to the child)
• delete the child deleteChild (takes the index of the array and deletes this element; returns a logical value - whether the element was deleted)
• get the number of persons in the countFamily family (parents in the family never change; if there is a change in the parental composition, it is already a different family)
• Redefine the toString() method

• Decide which fields should be used for comparison in the equals() method (for example, the animal's habits may vary).

• In the Main class, create several families so that each class uses all possible constructors. Display information about each person on the screen.

• In the Main class, create a mom, a dad, a child, and their pet. Provide all the necessary references (from the child to the parents and the foster child) so that a complete family will come out. Call all available methods on the child (including the toString() method) and on its pet.

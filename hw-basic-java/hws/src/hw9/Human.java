

import java.util.Random;

public class Human {
    private String name;
    private String surName;
    private int year;
    private int iQ = new Random().nextInt(100);
    private Family family;
    private Human mother;
    private Human father;
    private Pet pet;

    public Human(String name, String surName, int year) {
        this.name = name;
        this.surName = surName;
        this.year = year;
    }

    public Human(String name, String surName, int year, Human mother, Human father) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surName, int year, int iQ, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iQ = iQ;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human(String name, String surName, int year, int iQ, Family family, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iQ = iQ;
        this.family = family;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human() {
    }

    public Human(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIQ() {
        return iQ;
    }

    public void setIQ(int iQ) {
        this.iQ = iQ;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getType());
    }

    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.println("i have " + pet.getType() + ", it is " + pet.getAge() + " years old, it is very cunning");
        } else if (pet.getTrickLevel() <= 50) {
            System.out.println("i have " + pet.getType() + ", it is " + pet.getAge() + " years old, almost not cunning");
        }
    }

    public void getInfo() {
        System.out.println("trickLevel " + name);
        System.out.println("type " + surName);
        System.out.println("nickName " + year);
        System.out.println("age " + iQ);
        System.out.println("habits " + family);
        System.out.println("habits " + mother);
        System.out.println("habits " + father);
        System.out.println("habits " + pet);
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", surName=" + surName + ", year=" + year + ", iQ=" + iQ + ", family=" + family
                + ", mother=" + mother + ", father=" + father + ", pet=" + pet + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surName == null) ? 0 : surName.hashCode());
        result = prime * result + year;
        result = prime * result + iQ;
        result = prime * result + ((family == null) ? 0 : family.hashCode());
        result = prime * result + ((mother == null) ? 0 : mother.hashCode());
        result = prime * result + ((father == null) ? 0 : father.hashCode());
        result = prime * result + ((pet == null) ? 0 : pet.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Human other = (Human) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surName == null) {
            if (other.surName != null)
                return false;
        } else if (!surName.equals(other.surName))
            return false;
        if (year != other.year)
            return false;
        if (iQ != other.iQ)
            return false;
        if (family == null) {
            if (other.family != null)
                return false;
        } else if (!family.equals(other.family))
            return false;
        if (mother == null) {
            if (other.mother != null)
                return false;
        } else if (!mother.equals(other.mother))
            return false;
        if (father == null) {
            if (other.father != null)
                return false;
        } else if (!father.equals(other.father))
            return false;
        if (pet == null) {
            if (other.pet != null)
                return false;
        } else if (!pet.equals(other.pet))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Dog", 4);
        Pet pet2 = new Pet("Cat", 1);
        Pet pet3 = new Pet("Bird", 6);
        Human human1 = new Human(pet1);
        human1.greetPet();
        human1.describePet();
        Human human2 = new Human(pet2);
        human2.greetPet();
        human2.describePet();
        Human human3 = new Human(pet3);
        human3.greetPet();
        human3.describePet();
    }

}

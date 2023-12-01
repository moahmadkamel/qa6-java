

import java.util.Arrays;
import java.util.Random;

public class Pet {
    private int trickLevel = new Random().nextInt(100);
    private String type;
    private String nickName;
    private int age;
    private String[] habits;

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    

    public Pet(String type) {
        this.type = type;
    }

    public Pet(String type, String nickName) {
        this.type = type;
        this.nickName = nickName;
    }

    public Pet(int trickLevel, String type, String nickName, int age, String[] habits) {
        this.trickLevel = trickLevel;
        this.type = type;
        this.nickName = nickName;
        this.age = age;
        this.habits = habits;
    }

    public Pet() {
    }

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void respond() {
        System.out.println("Hello, owner. I - " + type + ". I bored!");
    }

    public void eat() {
        System.out.println("I'm eating!");
    }

    public void foul() {
        System.out.println("You need to cover your tracks well...");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + trickLevel;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
        result = prime * result + age;
        result = prime * result + Arrays.hashCode(habits);
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
        Pet other = (Pet) obj;
        if (trickLevel != other.trickLevel)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (nickName == null) {
            if (other.nickName != null)
                return false;
        } else if (!nickName.equals(other.nickName))
            return false;
        if (age != other.age)
            return false;
        if (!Arrays.equals(habits, other.habits))
            return false;
        return true;
    }

    public void getInfo() {
        System.out.println("trickLevel " + trickLevel);
        System.out.println("type " + type);
        System.out.println("nickName " + nickName);
        System.out.println("age " + age);
        System.out.println("habits " + habits);
    }

    @Override
    public String toString() {
        return "dog [nickName=" + nickName + ", age=" + age + ", trickLevel=" + trickLevel
                + ", habits=" + Arrays.toString(habits) + "]";
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.eat();
        pet.foul();
        
        Pet petRespond1 = new Pet("Dog");
        Pet petRespond2 = new Pet("Cat");
        Pet petRespond3 = new Pet("Bird");

        System.out.println(petRespond1.trickLevel);
        System.out.println(petRespond2.trickLevel);
        System.out.println(petRespond3.trickLevel);

        petRespond1.respond();
        petRespond2.respond();
        petRespond3.respond();
    }
}

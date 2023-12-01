

public class Family {
    private String familyName;

    private Human mother;
    private Human father;
    private Human[] children;

    private Pet pet;
    

    public Family(String familyName, Human mother, Human father) {
        this.familyName = familyName;
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(Human newChild) {
        newChild.setFamily(this);
        Human[] newArray = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children = newArray;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArray = new Human[children.length - 1];
        int counter = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
                children[i] = newArray[counter];
                counter++;
        }
        children = newArray;
    }


    public static void main(String[] args) {
        Human mother = new Human("Ann", "Smith", 27);
        System.err.println(mother.getFamily());
        Human father = new Human("Mann", "Smith", 33);
        Human child1 = new Human("child1", "Smith", 1);
        Human child2 = new Human("child2", "Smith", 2);
        Human child3 = new Human("child3", "Smith", 3);

        Family smith = new Family("Smith", mother, father);
        System.out.println(smith.countFamily());
        smith.addChild(child1);
        smith.addChild(child2);
        smith.addChild(child3);
        System.out.println(smith.countFamily());

        System.err.println(mother.getFamily());
        System.err.println(father.getFamily());
        System.out.println(mother.getFamily().equals(father.getFamily()));

        System.out.println("============");
        System.out.println(child2.getFamily());
        smith.deleteChild(1);
        System.out.println("family nums " + smith.countFamily());
        System.out.println(child2.getFamily());
        System.out.println(child2.getName());
    }
}

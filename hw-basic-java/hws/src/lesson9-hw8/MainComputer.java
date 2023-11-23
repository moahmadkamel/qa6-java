public class MainComputer {
    public static void main(String[] args) {
        // Computer computer1 = new Computer("Razer", 1000, 32, 128);
        Computer computer1 = new Computer("Razer", 1000, 32, 128);
        computer1.getInfo();
        System.out.println(computer1);
        // Computer computer2 = new Computer("Apple", 16, 64);
        // System.out.println(computer2.hashCode());
        System.out.println(computer1.hashCode());
        System.out.println("=============");
        // Computer computer3 = new Computer("Dell", 900, 24, 8);
        Computer computer3 = new Computer("Razer", 1000, 32, 128);
        computer3.getInfo();
        System.out.println(computer3);
        // Computer computer4 = new Computer("Apple", 16, 64);
        // System.out.println(computer4.hashCode());
        System.out.println(computer3.hashCode());
        // System.out.println(computer2.equals(computer4));
        System.out.println(computer1.equals(computer3));
    }
}

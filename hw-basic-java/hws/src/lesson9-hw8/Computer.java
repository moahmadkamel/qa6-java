
/*
1)
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
*/

public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int videoCard;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }


    public Computer(String brand, int price, int videoCard, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public Computer(String brand, int videoCard, int ram) {
        this.brand = brand;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Computer other = (Computer) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        if (ram != other.ram)
            return false;
        if (videoCard != other.videoCard)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        result = prime * result + ram;
        result = prime * result + videoCard;
        return result;
    }

    @Override
    public String toString() {
        return "Computer [Name=" + brand + ", Price=" + price + ", Videocard=" + videoCard + ", Ram=" + ram + "]";
    }

    public void getInfo() {
        System.out.println("Brand " + brand);
        System.out.println("Price " + price);
        System.out.println("VideoCard " + videoCard);
        System.out.println("Ram " + ram);
    }
}

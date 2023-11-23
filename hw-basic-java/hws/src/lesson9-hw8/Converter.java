
/*
3)
create a converter class that will have methods for converting primitive data types:
method convertToInt; (converts byte, short, int, long, char, float, double, String).
When you enter boolean, it displays a message that the type entered is boolean.

convertToDouble; (converts byte, short, int, long, char, float, double, String).
When you enter boolean, it displays a message that the type entered is boolean.

convertToString; (converts byte, short, int, long, char, boolean, float, double, String).

This class should have only one constructor, in the parameters of which you can specify its name.
And also only one getter method for obtaining information about the name of this converter.
*/


public class Converter {
    public String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte b) {
        return b;
    }

    public double convertToDouble(byte b) {
        return b;
    }

    public String convertToString(byte b) {
        return (String) String.valueOf(b);
    }

    public int convertToInt(short s) {
        return s;
    }

    public double convertToDouble(short s) {
        return s;
    }

    public String convertToString(short s) {
        return (String) String.valueOf(s);
    }

    public int convertToInt(int i) {
        return i;
    }

    public double convertToDouble(int i) {
        return i;
    }

    public String convertToString(int i) {
        return (String) String.valueOf(i);
    }

    public int convertToInt(long l) {
        return (int) l;
    }

    public double convertToDouble(long l) {
        return (double) l;
        // return l;
    }

    public String convertToString(long l) {
        return (String) String.valueOf(l);
    }

    public int convertToInt(char c) {
        return c;
    }

    public double convertToDouble(char c) {
        return c;
    }

    public String convertToString(char c) {
        return (String) String.valueOf(c);
    }

    public int convertToInt(float f) {
        return (int) f;
    }

    public double convertToDouble(float f) {
        // return (double) f;
        return f;
    }

    public String convertToString(float f) {
        return (String) String.valueOf(f);
    }

    public int convertToInt(double d) {
        return (int) d;
    }

    public double convertToDouble(double d) {
        // return (double) d;
        return d;
    }
    
    public String convertToString(double d) {
        return (String) String.valueOf(d);
    }

    public int convertToInt(String s) {
        return (int) Integer.parseInt(s);
    }

    public double convertToDouble(String s) {
        return (double) Double.parseDouble(s);
    }

    public String convertToString(String s) {
        return s;
    }

    public String convertToString(boolean bool) {
        return (String) String.valueOf(bool);
    }

    public boolean convertToInt() {
        return false;
    }

    public boolean convertToDouble() {
        return false;
    }

    public void convertToInt(boolean boo) {
        System.out.println("entered boolean type");
    }

    public void convertToDouble(boolean boo) {
        System.out.println("entered boolean type");
    }

    public static void main(String[] args) {
        new Converter("ConvToInt").convertToInt(false);
        new Converter("ConvToDouble").convertToDouble(false);
    }
}

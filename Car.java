public class Car {
    private String make;
    private String color;
    private int year;

    // 1) Default Constructor
    public Car() {
        this.make = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    // 2) Parametric Constructor
    public Car(String make, String color, int year) {
        this.make = make;
        this.color = color;
        this.year = year;
    }

    // 3) Copy Constructor
    public Car(Car otherCar) {
        this.make = otherCar.make;
        this.color = otherCar.color;
        this.year = otherCar.year;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // 6) Print Method to print car information
    public void printMe() {
        System.out.println("Make: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println();
    }
}


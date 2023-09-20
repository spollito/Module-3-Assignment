public class Main {
    public static void main(String[] args) {
        // 4) Create 4 objects of type Car
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Toyota", "Red", 2022); // Parametric constructor
        Car car3 = new Car("Ford", "Blue", 2020); // Parametric constructor
        Car car4 = new Car(car2); // Copy constructor
      Car car5 = car4;
        // 5) Replicate the shallow copy issue
        car2.setColor("Purple"); // Modify car2's color

        // Print car information
        System.out.println("Car 1:");
        car1.printMe();

        System.out.println("Car 2:");
        car2.printMe();

        System.out.println("Car 3:");
        car3.printMe();

        System.out.println("Car 4 (Copy of Car 2):");
        car4.printMe();
      car5.printMe();
      System.out.println("==============================");
        car5.setColor("Green");
      car4.printMe();
      car5.printMe();
    }
}



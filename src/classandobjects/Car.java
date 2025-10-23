package classandobjects;

class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tesla";
        c1.year = 2024;
        c1.displayInfo();
    }
}


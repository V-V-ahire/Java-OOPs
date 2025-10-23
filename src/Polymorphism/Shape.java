package Polymorphism;

class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw();
        s2.draw();
    }
}

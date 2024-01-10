class Rectangle {
    // Data members
    protected double length;
    protected double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    // Constructor for Square
    public Square(double side) {
        // Call the constructor of the base class (Rectangle)
        super(side, side);
    }
}

class Main {
    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Area of the Rectangle : " + rectangle.getArea() );
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());

        Square square = new Square(5.0);

        // Accessing methods from Rectangle class
        System.out.println("Area of the square: " + square.getArea());
        System.out.println("Perimeter of the square: " + square.getPerimeter());
    }
}
//4. Write a program to create interface Area. Create three classes called rectangle, triangle and square calculate areas respectively.

// Interface
interface Area {
    void calculateArea();
}

// Rectangle class
class Rectangle implements Area {
    int length = 10;
    int width = 5;

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Triangle class
class Triangle implements Area {
    int base = 8;
    int height = 4;

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

// Square class
class Square implements Area {
    int side = 6;

    public void calculateArea() {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }
}

// Main class
class AreaDemo {
    public static void main(String args[]) {

        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square s = new Square();

        r.calculateArea();
        t.calculateArea();
        s.calculateArea();
    }
}
package h.polymorphism;

public class Overridding {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
    }
}

class Shape{
    void draw(){
        //draw my shape
        System.out.println("Shape - draw my shape.");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle - draw my circle");

    }
}

class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Square - draw my square");

    }
}
class Hexagon extends Shape{}
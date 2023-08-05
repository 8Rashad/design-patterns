package bridge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Color black = new BlackColor();
//        Color white = new WhiteColor();
//
//        Shape blackCircle = new Circle(black);
//        Shape whiteSquare = new Square(white);
//
//        blackCircle.draw();
//        whiteSquare.draw();

        Shape[] shapes = {
                new Circle(new BlackColor()),
                new Square(new WhiteColor())
        };

        Arrays.stream(shapes).forEach(Shape::draw);
    }
}

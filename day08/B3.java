class Figure {

}

class Rect extends Figure {
    void draw() {
        System.out.println("사각형을 그리다");
    }
}

class Triangle extends Figure {
    void draw() {
        System.out.println("삼각형을 그리다");
    }
}

class Circle extends Figure {
    void draw() {
        System.out.println("원을 그리다");
    }
}

public class B3 {
    public static void main(String[] args) {
        Figure[] fs = {new Rect(), new Triangle(), new Circle()};

        for (Figure f : fs) {
            // f.draw(); // error: cannot find symbol
        }
    }
}
class Figure{
	void draw(){
		System.out.println("도형을 그리다");
	}
}
class Rect extends Figure{
	void draw(){ //오버라이딩
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Figure{
	void draw(){ //오버라이딩
		System.out.println("원형을 그리다");
	}
}
class Triangle extends Figure{
	void draw(){ //오버라이딩
		System.out.println("삼각형을 그리다");
	}
}
class B { 
	public static void main(String[] args) {
		Figure f1 = new Figure();
		Figure f2 = new Rect();
		Figure f3 = new Circle();
		Figure f4 = new Triangle();
		f1.draw(); f2.draw(); f2.draw(); f2.draw();
	} 
}

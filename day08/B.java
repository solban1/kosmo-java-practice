class Figure{
	void draw(){
		System.out.println("������ �׸���");
	}
}
class Rect extends Figure{
	void draw(){ //�������̵�
		System.out.println("�簢���� �׸���");
	}
}
class Circle extends Figure{
	void draw(){ //�������̵�
		System.out.println("������ �׸���");
	}
}
class Triangle extends Figure{
	void draw(){ //�������̵�
		System.out.println("�ﰢ���� �׸���");
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

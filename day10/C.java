class C 
{
	final int I = 3;
	final void m(){
		final int J = 1;
	}
	//final C(){} //생성자를 오버라이딩 개념이 없음 
}
class CChild extends C {
	//void m(){ //오버라이딩을 막음 
	//}
}	


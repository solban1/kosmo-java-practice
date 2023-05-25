import java.util.*;

class K {
	Vector<String> v1 = new Vector<String>(); //1차원 
	Vector<String> v2 = new Vector<String>(); //1차원  
	Vector<Vector<String>> v = new Vector<Vector<String>>(); //2차원 
	void in(){
		v1.add("봄");v1.add("여름");v1.add("가을");v1.add("겨울");
		v2.add("여행");v2.add("선물");v2.add("쇼핑");v2.add("외식");
		v.add(v1); v.add(v2);
	}
	void out(){
		for(Vector<String> item : v){
			for(String str : item){
				System.out.println(str);
			}
		}
	}
	public static void main(String[] args){
		K k = new K();
		k.in();
		k.out();
	}
}

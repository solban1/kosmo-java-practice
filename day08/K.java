import java.util.*;

class K {
	Vector<String> v1 = new Vector<String>(); //1���� 
	Vector<String> v2 = new Vector<String>(); //1����  
	Vector<Vector<String>> v = new Vector<Vector<String>>(); //2���� 
	void in(){
		v1.add("��");v1.add("����");v1.add("����");v1.add("�ܿ�");
		v2.add("����");v2.add("����");v2.add("����");v2.add("�ܽ�");
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

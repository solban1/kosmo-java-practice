import java.util.*;

class G 
{
	Vector<String> v = new Vector<String>();
	void in(){
		v.add("��");v.add("����");v.add("����");v.add("�ܿ�");v.add("����");
	}
	void out1(){
		int size = v.size();
		for(int i=0; i<size; i++){
			String item = v.get(i);
			System.out.println(item);
		}
	}
	void out2(){
		for(String item : v) System.out.println(item);
	}
	public static void main(String[] args) {
		G g = new G();
		g.in();
		//g.out1();
		g.out2();	
	}
}

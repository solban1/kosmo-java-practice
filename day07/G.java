import java.util.*;

class G 
{
	Vector<String> v = new Vector<String>();
	void in(){
		v.add("봄");v.add("여름");v.add("가을");v.add("겨울");v.add("여름");
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

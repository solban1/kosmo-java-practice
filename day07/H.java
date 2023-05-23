import java.util.*;

class H 
{
	TreeSet<String> ts = new TreeSet<String>();
	void in(){
		ts.add("��"); ts.add("����"); ts.add("����"); ts.add("�ܿ�"); ts.add("����"); 
	}
	void out1(){
		//Iterator<String> iter = ts.iterator();
		Iterator<String> iter = ts.descendingIterator();
		while(iter.hasNext()){
			String item = iter.next();
			System.out.println("item: " + item);
		}
	}	
	void out2(){
		for(String item: ts){
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) {
		H h = new H();
		h.in();
		//h.out1();
		h.out2();
	}
}

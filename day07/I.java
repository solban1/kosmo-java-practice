import java.util.*;

class I 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	void in(){
		ht.put(10, "봄");ht.put(20, "여름");ht.put(30, "가을");ht.put(40, "겨울"); ht.put(50, "여름");
	}
	void out1(){
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()){
			Integer key = e.nextElement();
			String val = ht.get(key);
			System.out.println("[Old] 키: " + key + ", 값: "+ val);
		}
	}
	void out2(){
		Set<Integer> keys = ht.keySet();
		for(Integer key : keys){
			System.out.println("[New] 키: " + key + ", 값: "+ ht.get(key));
		}
	}
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.in();
		//obj.out1();
		obj.out2();	
	}
}

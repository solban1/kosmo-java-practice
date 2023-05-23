import java.util.*;

class I 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	void in(){
		ht.put(10, "��");ht.put(20, "����");ht.put(30, "����");ht.put(40, "�ܿ�"); ht.put(50, "����");
	}
	void out1(){
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()){
			Integer key = e.nextElement();
			String val = ht.get(key);
			System.out.println("[Old] Ű: " + key + ", ��: "+ val);
		}
	}
	void out2(){
		Set<Integer> keys = ht.keySet();
		for(Integer key : keys){
			System.out.println("[New] Ű: " + key + ", ��: "+ ht.get(key));
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

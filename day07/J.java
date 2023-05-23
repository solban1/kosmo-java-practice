import java.util.*;

class J 
{
	ArrayList<Double> list = new ArrayList<Double>();
	
	void box(){
		Double dObj1 = 0.1; //Boxing ( double -> Double ) 
		double d1 = dObj1; //UnBoxing ( Double -> double )
		System.out.println("d1: " + (d1+1));
	}
	void in(){
		list.add(0.1);list.add(0.2);list.add(0.3);list.add(0.4);
	}
	void out(){
		for(double item: list){
			System.out.println(item);
		}
	}
	public static void main(String[] args) 
	{
		J j = new J();
		//j.box();
		j.in();
		j.out();
	}
}

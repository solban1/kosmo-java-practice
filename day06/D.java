class D 
{
	void m1(){ //��� ex) +, -, *, /, %
		int i = 1; 
		int j = 2; 
		int r = (i+j)*2;
		System.out.println("r: " + r);
	}
	void m2(){ //���� ex) ++, -- 
		int i = 0;
		System.out.println("i(1): "+ i++); //0 
		System.out.println("i(2): " + i); //1
		
		int j = 1; 
		int r = 0 + ++j; //why?
		System.out.println("r: " + r); //2
		System.out.println("j: " + j); //2

		int k = 0; 
		k++;
		System.out.println("k: " + k); //1
	}
	void m3(){ //������� ex) +=, -=, *=, /=, %=
		int r = 5;
		r%=3;
		System.out.println("������: " + r);
	}
	void m4(){ //��Ʈ ex) &, |, ^, ~, ����Ʈ( <<, >>, >>> )
		int r = 5 | 3;
		System.out.println("r: " + r);
	}
	void m5(){ //ex) ==, !=, <, <=, >, >=
		int i = 1;
		int j = 0;
		boolean b = i >= ++j;
		System.out.println("b: " + b);
	}
	void m6(){ //ex) &, &&, |, ||  ( Short Circuit ) 
		int i = 1;
		int j = 0; 
		boolean b = false;
		boolean r =  b && (i>++j);
		System.out.println("r: " + r);
		System.out.println("j: " + j);
	}
	void m7(){ //ex) &=, |=
		boolean b = false;
		b |= true;
		System.out.println("b: " + b);
	}
	void m8(){ //ex) A? B:C
		int i = 1; 
		String r = (i<2)? "¥��":"«��";
		System.out.println("r: " + r);	
	}
	void m9(){ //ex) ��ü instanceof Ŭ����
		String str = new String("¥��");
		boolean r1 = str instanceof Object;
		System.out.println("r1: " + r1); //true 

		Object obj = new Object();
		boolean r2 = obj instanceof String;
		System.out.println("r2: " + r2); //false
	}
	public static void main(String[] args) {
		D d = new D();
		//d.m1();
		//d.m2();
		//d.m3();
		//d.m4();
		//d.m5();
		//d.m6();
		//d.m7();
		//d.m8();
		d.m9();
	}
}

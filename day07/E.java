class E 
{
	int is1[] = {1, 2};
	int is2[] = {30, 40, 50, 60};
	int iss[][] = {is1, is2, {500, 600, 700}, {8000}};
	int isss[][][] = { iss, {{9001, 9002}, {9010, 9020, 9030}}, {{10000}} };
	
	void out1(){ //iss 출력 
		for(int i=0; i<iss.length; i++){
			for(int j=0; j<iss[i].length; j++){
				System.out.println("iss["+i+"]["+j+"]: "+iss[i][j]);
			}
		}
	}
	void out2(){ //isss 출력 
		for(int i=0; i<isss.length; i++){
			for(int j=0; j<isss[i].length; j++){
				for(int k=0; k<isss[i][j].length; k++){
					System.out.println("isss["+i+"]["+j+"]["+k+"]: "+isss[i][j][k]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		E e = new E();
		//e.out1();
		e.out2();
	}
}

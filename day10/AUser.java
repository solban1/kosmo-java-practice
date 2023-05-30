package aa.bb;

//import aa.bb.A;

class AUser 
{
    void use(){
		new A().useSelf();
	}
	public static void main(String[] args) 
	{
		AUser user = new AUser();
		user.use();
	}
}

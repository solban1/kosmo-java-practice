class B5 {
	private static void m1() {
		switch ("asdfasdffdsafdsa") {
			case "a":
				System.out.println("a");
				break;
				
			//case 'b':		// error: incompatible types: char cannot be converted to String
			// 	System.out.println("b");
			// 	break;
			//case 1:		// error: incompatible types: int cannot be converted to String
			// 	System.out.println("1");
			// 	break;
			default:
				System.out.println("default");
		}
	}

	public static void main(String[] args) {
		m1();
	}
}

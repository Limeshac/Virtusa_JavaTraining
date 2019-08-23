package example2.lamda.parameterizedMethod;

public class Application {

	public static void main(String[] args) {

//		Math q1 = new Math() {
//			
//			@Override
//			public int power(int value) {
//				
//				return value*value;
//			}
//		};
		
		
		Math q1 = x->x*x;
		
		int anzer = q1.power(9);
		System.out.println(anzer);
	}

}

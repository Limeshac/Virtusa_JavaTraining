package example1.lamda.byLamda;

public class Application {

	public static void main(String[] args) {

		
			Printer printer =  ()->System.out.println("Print by lamda");
				
			printer.print();
	}

}

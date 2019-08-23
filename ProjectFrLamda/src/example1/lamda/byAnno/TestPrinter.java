package example1.lamda.byAnno;

public class TestPrinter {

	  void testPrinter() {

		Printer printer = new Printer() {
			
			@Override
			public void print() {
				System.out.println("US");
			}
		};
		 printer.print();
		
	}

}

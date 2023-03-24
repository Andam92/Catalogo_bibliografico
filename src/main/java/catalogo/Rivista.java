package catalogo;

public class Rivista extends Elemento {
	
	
	Periodicità periodicità;
		
		public Rivista(String isbn, String titolo, int anno, int pagine, Periodicità periodicità) {
			super(isbn, titolo, anno, pagine);
			this.periodicità = periodicità;
		}
		
		public void getElemento() {		
			System.out.println("Periodicità: " + this.periodicità);
			super.getElemento();
		}
}

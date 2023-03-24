package catalogo;

public class Libro extends Elemento {
	
	String autore;
	Genere genere;
	
		public Libro(String isbn, String titolo, int anno, int pagine, String autore, Genere genere) {
			super(isbn, titolo, anno, pagine);
			this.autore = autore;
			this.genere = genere;
		}
		
		public void getElemento() {
			System.out.println("Autore: " + this.autore);	
			System.out.println("Genere: " + this.genere);
			super.getElemento();
		}
	
}

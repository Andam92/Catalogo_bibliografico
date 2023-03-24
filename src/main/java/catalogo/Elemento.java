package catalogo;

public class Elemento {

	public String codiceISBN;
	public String titolo;
	public int annoPubblicazione;
	public int numeroPagine;
	
	 public Elemento(String isbn, String titolo, int anno, int pagine) {
		 	this.codiceISBN = isbn;
			this.titolo = titolo;
			this.annoPubblicazione = anno;
			this.numeroPagine = pagine;
	 }
	 
		public void getElemento() {
			System.out.println("ISBN: " + this.codiceISBN);
			System.out.println("Titolo: " + this.titolo);		
			System.out.println("Pubblicato nel: " + this.annoPubblicazione);
			System.out.println();
		}
}

package catalogo;

import java.util.ArrayList;

public class Archivio {

	public static ArrayList<Elemento> archivio = new ArrayList<Elemento>();
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("ID12850988", "Lo Hobbit", 1920, 100, "Tolkien", Genere.FANTASY);
		Libro libro2 = new Libro("ID46914146", "Il richiamo di Cthulu", 1930, 620, "Lovecraft", Genere.HORROR);
		Libro libro3 = new Libro("ID83587857", "Il Codice Da Vinci", 2010, 400, "Dan Brown", Genere.THRILLER);
		Libro libro4 = new Libro("ID70046739", "Re Artù", 2007, 360, "Cornwell", Genere.STORICO);
		Libro libro5 = new Libro("ID83126072", "Fondazione", 1960, 700, "Aasimov", Genere.SCIFI);
		Libro libro6 = new Libro("ID86384332", "Le crociate", 2021, 230, "Barbero", Genere.SAGGIO);

		Libro[] libri = {libro1, libro2, libro3, libro4, libro5, libro6};
		
		for (int i = 0; i < libri.length; i++) {
			archivio.add(libri[i]);
		}
		
		
		Rivista rivista1 = new Rivista("ID83379679", "Rivista1", 2020, 30, Periodicità.SETTIMANALE);
		Rivista rivista2 = new Rivista("ID05340011", "Rivista2", 2021, 30, Periodicità.MENSILE);
		Rivista rivista3 = new Rivista("ID33595094", "Rivista3", 2019, 30, Periodicità.SETTIMANALE);
		Rivista rivista4 = new Rivista("ID88766917", "Rivista4", 2018, 30, Periodicità.SEMESTRALE);
		Rivista rivista5 = new Rivista("ID30648884", "Rivista5", 2017, 30, Periodicità.MENSILE);
		Rivista rivista6 = new Rivista("ID39829745", "Rivista6", 2022, 30, Periodicità.SEMESTRALE);
		
		Rivista[] riviste = {rivista1, rivista2, rivista3, rivista4, rivista5, rivista6};
		
		for (int i = 0; i < riviste.length; i++) {
			archivio.add(riviste[i]);
		}
		
		
		//STAMPA LIBRI esempio
		archivio.get(3).getElemento();
		
		//STAMPA RIVISTE esempio
		archivio.get(8).getElemento();

		
		
		

		
		// archivio.get(2).getElemento();
		
		creaId();
		//ID Libri (ID12850988, ID30648884, ID46914146, ID83587857, ID70046739, ID83126072, ID86384332)
		//ID Rivista (ID83379679, ID05340011, ID33595094, ID17625363, ID88766917, ID39829745)
				
		 // System.out.println(libro1.titolo);
		
	}
	
	public static String creaId() {
		String id = "ID";
		for(int i = 0; i < 8; i++) {
			id+= (int) Math.floor(Math.random() * 10);
		}
		System.out.println(id);
		return id;
	}

}

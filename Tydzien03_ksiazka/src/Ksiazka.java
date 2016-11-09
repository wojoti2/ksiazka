public class Ksiazka {
	private int rok, wydanie, id;
	private String tytul;
	private String autor;

	//Ponizsze linie mozna wygenerowac przez Source -> generate getters and setters/constructor w Eclipse (OPROCZ toString!)
	// CONSTRUCTOR
	
	public Ksiazka(int id, int rok, int wydanie, String tytul, String autor) { //<< pamietaj ze tutaj kolejnosc ma znaczenie bo to konstruktor
		super();
		this.rok = rok;
		this.wydanie = wydanie;
		this.id = id;
		this.tytul = tytul;
		this.autor = autor;
	}

	// GETTERS AND SETTERS

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public int getWydanie() {
		return wydanie;
	}

	public void setWydanie(int wydanie) {
		this.wydanie = wydanie;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() { //toString pozwala nam printowac tablice w taki sposob jaki ustalimy,przeksztalca dany rekord w string
		return "ID: " + id + ", Rok: " + rok + ", Nr. wydania: " + wydanie + ", Tytul: " + tytul + ", Autor: " + autor;
	}

}

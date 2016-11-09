import java.util.Comparator;

public class CompAutor implements Comparator<Ksiazka> {
	public int compare(Ksiazka k1, Ksiazka k2) {
		if (k1.getAutor().compareTo(k2.getAutor()) > 0) //standardowe dzialanie compareTo - jesli k1 ma wyzsza litera niz k2 to compareTo zwroci liczbe >0
			return 1; //taka a nie inna wartosc returnow jest chyba ustalona jako standard do uzycia jako komparator dla string
		else if (k1.getAutor().compareTo(k2.getAutor()) < 0)
			return -1;
		else if (k1.getAutor().compareTo(k2.getAutor()) == 0)
			return 0;
		else
			return 0;
	}
}

import java.util.Comparator;

public class CompTytul implements Comparator<Ksiazka> {
	public int compare(Ksiazka k1, Ksiazka k2) {
		if (k1.getTytul().compareTo(k2.getTytul()) > 0)
			return 1;
		else if (k1.getTytul().compareTo(k2.getTytul()) < 0)
			return -1;
		else if (k1.getTytul().compareTo(k2.getTytul()) == 0)
			return 0;
		else
			return 0;
	}
}

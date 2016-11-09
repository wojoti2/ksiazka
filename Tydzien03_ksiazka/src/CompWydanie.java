import java.util.Comparator;

public class CompWydanie implements Comparator<Ksiazka> {
	public int compare(Ksiazka k1, Ksiazka k2) {
		if (k1.getWydanie() > k2.getWydanie())
			return 1;
		else if (k1.getWydanie() < k2.getWydanie())
			return -1;
		else if (k1.getWydanie() == k2.getWydanie())
			return 0;
		else
			return 0;
	}
}

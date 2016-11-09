import java.util.Comparator;

public class CompRok implements Comparator<Ksiazka> {
	public int compare(Ksiazka k1, Ksiazka k2) {
		if (k1.getRok() > k2.getRok()) //dzieki takiemu ustawieniu komparator powie arrays.sort ze liczba i+1 jest wieksza niz i czyli zamieni wpisy miejscami
			return 1;
		else if (k1.getRok() < k2.getRok())
			return -1;
		else if (k1.getRok() == k2.getRok())
			return 0;
		else
			return 0;
	}
}

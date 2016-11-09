import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Tydzien03 {

	public static void main(String[] args) {
		// String txt1 = JOptionPane.showInputDialog("Okresl rozmiar ksiazki");
		// int n = Integer.parseInt(txt1);//deklaracja rozmiaru ksiazki
		ArrayList<Ksiazka> ksiazka = new ArrayList<Ksiazka>();
		
		 /* for (int i = 0; i < ksiazka.size(); i++) { 
		  String int2 = JOptionPane.showInputDialog("Wprowadz rok"); 
		  String int3 = JOptionPane.showInputDialog("Wprowadz wydanie"); 
		  String txt2 = JOptionPane.showInputDialog("Wprowadz tytul"); 
		  String txt3 = JOptionPane.showInputDialog("Wprowadz autora"); 
		  int y = Integer.parseInt(int2); int z = Integer.parseInt(int3);
		  ksiazka.add(new Ksiazka(i, y, z, txt2, txt3));*/
		 

		// ustalone odgornie wartosci do testow
		ksiazka.add(new Ksiazka(0, 11, 11, "txt23", "txt33"));
		ksiazka.add(new Ksiazka(1, 3, 3, "txt24", "txt32"));
		ksiazka.add(new Ksiazka(2, 22, 22, "txt22", "txt35"));
		ksiazka.add(new Ksiazka(3, 9, 9, "txt25", "txt31"));
		ksiazka.add(new Ksiazka(4, 8, 8, "txt21", "txt34"));

		System.out.println("Ksiegarnia:");
		for (int i = 0; i < ksiazka.size(); i++)
			System.out.println(ksiazka.get(i));

		while (true) {
			String s1 = JOptionPane
					.showInputDialog("Co chcesz zrobic: 1)Posortowac 2)Zmienic/usunac dany element w danym wpisie");
			int ss1 = Integer.parseInt(s1);
			switch (ss1) {// switch w celu wybrania opcji co chcemy zrobic,
							// obecnie zbedny bo nie ma opcji 2
			case 1: {
				String s2 = JOptionPane.showInputDialog("Po czym sortowac: 1)Rok 2)Wydanie 3)Tytul 4)Autor");
				int ss2 = Integer.parseInt(s2);
				switch (ss2) {
				case 1: {
					CompRok Rok = new CompRok();
					Collections.sort(ksiazka, Rok);
					for (int i = 0; i < ksiazka.size(); i++)
						ksiazka.get(i).setId(i);
					;
					break;
				}
				case 2: {
					CompWydanie Wydanie = new CompWydanie();
					Collections.sort(ksiazka, Wydanie);
					for (int i = 0; i < ksiazka.size(); i++)
						ksiazka.get(i).setId(i);
					;
					break;
				}
				case 3: {
					CompTytul Tytul = new CompTytul();
					Collections.sort(ksiazka, Tytul);
					for (int i = 0; i < ksiazka.size(); i++)
						ksiazka.get(i).setId(i);
					;
					break;
				}
				case 4: {
					CompAutor Autor = new CompAutor();
					Collections.sort(ksiazka, Autor);
					for (int i = 0; i < ksiazka.size(); i++)
						ksiazka.get(i).setId(i);
					;
					break;
				}
				}
				break;
			}
			case 2: {
				String s3 = JOptionPane.showInputDialog("Co chcesz zmienic: 1)Rok 2)Wydanie 3)Tytul 4)Autor");
				int ss3 = Integer.parseInt(s3);
				switch (ss3) {
				case 1: {
					String s4 = JOptionPane.showInputDialog("Wprowadz ID elementu");
					int ss4 = Integer.parseInt(s4);
					String s5 = JOptionPane.showInputDialog("Na co chcesz zmienic?");
					int ss5 = Integer.parseInt(s5);
					ksiazka.get(ss4).setRok(ss5);
					break;
				}
				case 2: {
					String s4 = JOptionPane.showInputDialog("Wprowadz ID elementu");
					int ss4 = Integer.parseInt(s4);
					String s5 = JOptionPane.showInputDialog("Na co chcesz zmienic?");
					int ss5 = Integer.parseInt(s5);
					ksiazka.get(ss4).setWydanie(ss5);
					break;
				}
				case 3: {
					String s4 = JOptionPane.showInputDialog("Wprowadz ID elementu");
					int ss4 = Integer.parseInt(s4);
					String s5 = JOptionPane.showInputDialog("Na co chcesz zmienic?");
					ksiazka.get(ss4).setTytul(s5);
					break;
				}
				case 4: {
					String s4 = JOptionPane.showInputDialog("Wprowadz ID elementu");
					int ss4 = Integer.parseInt(s4);
					String s5 = JOptionPane.showInputDialog("Na co chcesz zmienic?");
					ksiazka.get(ss4).setAutor(s5);
					break;
				}
				}
				break;
			}
			}
			System.out.println("Po zmianach:");
			for (int i = 0; i < ksiazka.size(); i++)
				System.out.println(ksiazka.get(i));
			s1 = JOptionPane.showInputDialog("Czy chcesz zrobic cos jeszcze? 1-tak/2-nie");
			int d = Integer.parseInt(s1);
			if (d != 1)
				return;
		}
	}

}

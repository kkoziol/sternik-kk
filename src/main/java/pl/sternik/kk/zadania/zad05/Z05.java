package pl.sternik.kk.zadania.zad05;

public class Z05 {

    public static void main(String[] args) {
        String[] tablica = { "Raz", "Dwa", "Trzy", "Cztery" };

        String tmp = zrobPetleFor(tablica);
        System.out.println(tmp);

        tmp = zrobPetleForEach(tablica);
//        System.out.println(tmp);

        tmp = zrobPetleWhile(tablica);
//        System.out.println(tmp);
        
    }

	static String zrobPetleFor(String[] tablica) {
		int i;
		String tmp = "Petla FOR";
        for (i = 0; i <= tablica.length - 1; i++) {
            tmp = tmp + "\n" +tablica[i];
        }
        return tmp;
	}
	static String zrobPetleWhile(String[] tablica) {
		int i;
        i = 0;
        while (i <= tablica.length - 1) {
            System.out.println(tablica[i]);
            i++;
        }     
        return "";
	}	
	static String zrobPetleForEach(String[] tablica) {
		String tmp ="";
		//brzydka metoda sklejania Stringa.
		tmp = tmp + "Petla FOREach";
		for (String string : tablica) {
            tmp = tmp +"\n" + string;
        }
		System.out.println(tmp);
		return tmp;
	}
}

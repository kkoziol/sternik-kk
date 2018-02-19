package pl.sternik.kk.zadania.zad32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Z32 {

    public static void main(String[] args) {
        String[] tab1 = {"ala", "Kevin", "Iza", "dorota", "Marek"};
        Z32 obj = new Z32();

        // kopiowanie tablicy
        String[] tab2 = obj.kopiujTab(tab1);
        obj.pokazTabPetlaFor(tab2);

        // sortowanie tablicy rosnace
        obj.sortujTablice(tab2, 'R');
        obj.pokazTabPetlaForeach(tab2);

        // sortowanie tablicy malejące
        obj.sortujTablice(tab2, 'M');
        obj.pokazTabPetlaForeach(tab2);

        // te same dane w postaci listy
        ArrayList<String> lista = new ArrayList<String>();
        lista = obj.stworzListe(tab2);
        // nieposortowana lista (foreach)
        obj.pokazListaPetlaForeach(lista);

        // sortowanie listy
        ArrayList<String> listaPosort = obj.sortujListe(lista);

        // posortowana lista (for)
        obj.pokazListaPetlaFor(listaPosort);

        // posortowana lista (foreach)
        obj.pokazListaPetlaForeach(listaPosort);

        // posortowana lista (iterator)
        obj.pokazListaPetlaIteraror(listaPosort);
    }

    public String[] kopiujTab(String[] tablica) {
        System.out.println("----- kopiowanie tablicy -----");
        String[] tabKopia = new String[tablica.length];
        System.arraycopy(tablica, 0, tabKopia, 0, tablica.length);
        return tabKopia;
    }

    public String pokazTabPetlaFor(String[] tablica) {
        String wynik = "";
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
            wynik = wynik + tablica[i].toString();
        }
        return wynik;
    }

    public String pokazTabPetlaForeach(String[] tablica) {
        String wynik = "";
        for (String s : tablica) {
            System.out.println(s);
            wynik = wynik + s.toString();
        }
        return wynik;
    }

    public String[] sortujTablice(String[] tablica, char tryb) {
        switch (tryb) {
        case 'M':
            System.out.println("----- sortowanie tablicy malejące -----");
            Arrays.sort(tablica, Collections.reverseOrder());
            break;

        case 'R':
            System.out.println("----- sortowanie tablicy rosnące -----");
            Arrays.sort(tablica);
            break;

        default:
            System.out.println("----- sortowanie tablicy - bez zmian -----");
        }

        return tablica;
    }

    public ArrayList<String> stworzListe(String[] tablica) {
        System.out.println("----- stworzenie listy -----");
        ArrayList<String> lista = new ArrayList<String>();
        for (String s : tablica) {
            lista.add(s);
        }
        return lista;
    }

    public ArrayList<String> sortujListe(ArrayList<String> lista) {
        System.out.println("----- posortowanie listy -----");
        Collections.sort(lista);
        return lista;
    }

    public String pokazListaPetlaFor(ArrayList<String> lista) {
        System.out.println("----- lista (for) -----");
        String wynik = "";
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            wynik = wynik + lista.get(i);
        }
        return wynik;
    }

    public String pokazListaPetlaForeach(ArrayList<String> lista) {
        System.out.println("----- lista (foreach) -----");
        String wynik = "";
        for (Object li : lista) {
            System.out.println(li);
            wynik = wynik + li;
        }
        return wynik;
    }

    public String pokazListaPetlaIteraror(ArrayList<String> lista) {
        System.out.println("----- lista (iterator) -----");
        String wynik = "";
        String elem = "";
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            elem = it.next();
            System.out.println(elem);
            wynik = wynik + elem;
        }
        return wynik;
    }
}

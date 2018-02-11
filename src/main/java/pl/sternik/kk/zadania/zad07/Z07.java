package pl.sternik.kk.zadania.zad07;

import java.util.Scanner;

public class Z07 {
    //Moj wlasny adapter na finalna lase scanner 
    //po to by sie dalo zrobic na niej mocka i lepiej potestowac.
    MyScanner input;
    //Jednoczesnie zasieg pakietowy a nie prywatny po to by test mogl to podmienic.

    public Z07(Scanner input) {
        super();
        this.input = new MyScanner(input);
    }

    public static void main(String[] args) {
        int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
        // int[] tablica = { 2, 2, 2, 4, 5, 5, 8, 1, 8 };
        Scanner input = new Scanner(System.in);

        Z07 z07 = new Z07(input);

        z07.findWithScanner(tablica);

        input.close();
    }

    int findWithScanner(int[] tablica) {
        System.out.print("Podaj liczbę X: ");
        int x = input.nextInt();
        x = (int) x;

        int tmp = znajdzPodzielna(tablica, x);

        if (tmp > -1) {
            System.out.println("Liczba " + tablica[tmp] + " jest podzielna przez " + x + " i znajduje się na pozycji " + tmp);
        } else {
            System.out.println("Brak liczby podzielnej");
        }
        return tmp;
    }

    public int znajdzPodzielna(int[] tablica, int dzielnik) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % dzielnik == 0) {
                return i;
            }
        }
        return -1;
    }
}

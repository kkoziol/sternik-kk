package pl.sternik.kk.zadania.zad37;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Z37 {
	public static void main(String[] args) {
		Z37 z37 = new Z37();

		System.out.println("---------- int ");

		int[] tabLosowaInt = z37.tabRandomInt(10, -5, 8);
        for (int i = 0; i < tabLosowaInt.length; i++) {
            System.out.print(tabLosowaInt[i] + " ");
        }
        System.out.println("");

        System.out.println("---------- double ");
        double[] tabLosowaDouble = z37.tabRandomDouble(10, -5, 5);
        for (int i = 0; i < tabLosowaDouble.length; i++) {
            System.out.print(tabLosowaDouble[i] + " ");
        }
        z37.writeTabIntToFile(tabLosowaInt, "inty.bin");
        z37.writeTabDoubleToFile(tabLosowaDouble, "double.bin");
        System.out.println("\nTeraz czytam:");
        System.out.println(z37.readTabIntFromFile("inty.bin"));
        System.out.println(z37.readTabDoubleFromFile("double.bin"));
    }

    public int[] tabRandomInt(int ilePoz, int min, int max) {
        int[] tabInt = new int[ilePoz];
        for (int i = 0; i < ilePoz; i++) {
            tabInt[i] = randomWithRangeInt(min, max);
        }
        return tabInt;
    }

    public double[] tabRandomDouble(int ilePoz, int min, int max) {
        double[] tabDouble = new double[ilePoz];
        for (int i = 0; i < ilePoz; i++) {
            tabDouble[i] = randomWithRangeDouble(min, max);
        }
        return tabDouble;
    }

    public int randomWithRangeInt(int min, int max) {
        int range = Math.abs(max - min) + 1;
        return (int) (Math.random() * range) + (min <= max ? min : max);
    }

    public double randomWithRangeDouble(double min, double max) {
        double range = Math.abs(max - min);
        double minLubMax = (min <= max ? min : max);
        return Math.random() * range + minLubMax;
    }

    public String writeTabIntToFile(int[] tab, String nazwaPliku) {
        String toFile = "";
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream(new File(nazwaPliku)));) {
            for (int i = 0; i < tab.length; i++) {
                os.writeInt(tab[i]);
                toFile = toFile + " " + tab[i];
            }
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        return toFile;
    }

    public String writeTabDoubleToFile(double[] tab, String nazwaPliku) {
        String toFile = "";
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream(new File(nazwaPliku)));) {
            for (int i = 0; i < tab.length; i++) {
                os.writeDouble(tab[i]);
                toFile = toFile + " " + tab[i];
            }
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        return toFile;
    }

    public String readTabIntFromFile(String nazwaPliku) {
        String fromFile = "";
        int liczba;

        try (DataInputStream is = new DataInputStream(new FileInputStream(new File(nazwaPliku)));) {
            while (is.available() > 0) {
                liczba = is.readInt();
                fromFile = fromFile + " " + liczba;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : " + e);
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        return fromFile;
    }

    public String readTabDoubleFromFile(String nazwaPliku) {
        String fromFile = "";
        double liczba;

        try (DataInputStream is = new DataInputStream(new FileInputStream(new File(nazwaPliku)));) {
            while (is.available() > 0) {
                liczba = is.readDouble();
                fromFile = fromFile + " " + liczba;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : " + e);
        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
        return fromFile;
    }
}

package pl.sternik.kk.zadania.zad07;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
public class Z07Test {

	int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
	MyScanner input;
	Z07 sut;

	@Before
	public void before() {
	    //mok na MyScanner bo Scanner jest klasa finalna i nie da sie zrobic na niej moka
		input = mock(MyScanner.class);
		sut = new Z07(new Scanner(System.in));//straszne kombinacje bo 
		// nie chce domyslnego konstruktora
		// anie konstruktora on Myskaner bo z zalozenia ma byc to klasa dostepna
		//tylko w pakiecie zad07
		//podmineniam implementacje w locie, na mojego mocka.
		sut.input=input;
	}

	@Test
	public void testPodzielnosciPrzez5() {
		int dzielnik = 5;

		int actual = sut.znajdzPodzielna(tablica, dzielnik);

		assertThat(actual).isEqualTo(0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDzielPrzezZero() {
		int dzielnik = 0;

		sut.znajdzPodzielna(tablica, dzielnik);
	}

	@Test
	public void testWitMockito(){
		when(input.nextInt()).thenReturn(5);

		int actual = sut.findWithScanner(tablica);
		
		assertThat(actual).isEqualTo(0);
		verify(input).nextInt();
	}

}
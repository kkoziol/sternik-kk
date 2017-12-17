package pl.sternik.kk.zadania.zad01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        int[] tabliczka = {22,3,2,4,6,8,9,0};

        for (int i = 0; i < tabliczka.length; i++) {
            System.out.println(tabliczka[i]);
        }
        int j=0;
        while (j< tabliczka.length){
            System.out.println(tabliczka[j]);
            j++;
        }

    }
}

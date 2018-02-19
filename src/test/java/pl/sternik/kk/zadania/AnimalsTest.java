package pl.sternik.kk.zadania;

import static pl.sternik.kk.zadania.animals.DogAssert.assertThat;

import org.junit.Test;
import pl.sternik.kk.zadania.animals.Dog;

public class AnimalsTest {

    @Test
    public void testThatCustomAssertionsWork() {
        
        Dog dog = new Dog();
        dog.setRasa("Pinczer");
        dog.setImie("Dyzio");
        
        
        assertThat(dog).isNotNull();
        assertThat(dog).hasFieldOrProperty("waga");

        assertThat(dog).hasRasa("Pinczer");
        assertThat(dog).hasImie("Dyzio");
        
    }
}



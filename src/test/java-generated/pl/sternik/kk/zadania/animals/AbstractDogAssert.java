package pl.sternik.kk.zadania.animals;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Dog} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractDogAssert<S extends AbstractDogAssert<S, A>, A extends Dog> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractDogAssert}</code> to make assertions on actual Dog.
   * @param actual the Dog we want to make assertions on.
   */
  protected AbstractDogAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Dog's imie is equal to the given one.
   * @param imie the given imie to compare the actual Dog's imie to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Dog's imie is not equal to the given one.
   */
  public S hasImie(String imie) {
    // check that actual Dog we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting imie of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualImie = actual.getImie();
    if (!Objects.areEqual(actualImie, imie)) {
      failWithMessage(assertjErrorMessage, actual, imie, actualImie);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Dog's rasa is equal to the given one.
   * @param rasa the given rasa to compare the actual Dog's rasa to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Dog's rasa is not equal to the given one.
   */
  public S hasRasa(String rasa) {
    // check that actual Dog we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting rasa of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualRasa = actual.getRasa();
    if (!Objects.areEqual(actualRasa, rasa)) {
      failWithMessage(assertjErrorMessage, actual, rasa, actualRasa);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Dog's waga is equal to the given one.
   * @param waga the given waga to compare the actual Dog's waga to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Dog's waga is not equal to the given one.
   */
  public S hasWaga(int waga) {
    // check that actual Dog we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting waga of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualWaga = actual.getWaga();
    if (actualWaga != waga) {
      failWithMessage(assertjErrorMessage, actual, waga, actualWaga);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Dog's wiek is equal to the given one.
   * @param wiek the given wiek to compare the actual Dog's wiek to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Dog's wiek is not equal to the given one.
   */
  public S hasWiek(int wiek) {
    // check that actual Dog we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting wiek of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualWiek = actual.getWiek();
    if (actualWiek != wiek) {
      failWithMessage(assertjErrorMessage, actual, wiek, actualWiek);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
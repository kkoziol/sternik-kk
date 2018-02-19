package pl.sternik.kk.zadania.animals;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class Assertions {

  /**
   * Creates a new instance of <code>{@link pl.sternik.kk.zadania.animals.DogAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static pl.sternik.kk.zadania.animals.DogAssert assertThat(pl.sternik.kk.zadania.animals.Dog actual) {
    return new pl.sternik.kk.zadania.animals.DogAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}

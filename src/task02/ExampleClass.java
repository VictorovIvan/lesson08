package task02;

/**
 * Class ExampleClass
 */
public class ExampleClass implements java.io.Serializable {
    public int first;
    public int second;

    /**
     * Constructor of the ExampleClass
     *
     * @param first  Some number for testing
     * @param second Some number for testing
     */
    public ExampleClass(int first, int second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Returns a object representing this value.
     *
     * @return A string representation of the value of this object in base
     */
    @Override
    public String toString() {
        return "ExampleClass{ " +
                "first = " + first +
                ", second = " + second +
                '}';
    }
}

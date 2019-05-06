package task01;

/**
 * Class Object
 */
public class Object implements java.io.Serializable {
    public int intExample;
    public long longExample;
    public short shortExample;
    public String stringExample;


    /**
     * Constructor
     *
     * @param intExample    Some integer number
     * @param longExample   Some long number
     * @param shortExample  Some short number
     * @param stringExample Some string
     */
    public Object(int intExample, long longExample, short shortExample, String stringExample) {
        this.intExample = intExample;
        this.longExample = longExample;
        this.shortExample = shortExample;
        this.stringExample = stringExample;
    }

    /**
     * Returns a object representing this value.
     *
     * @return A string representation of the value of this object in base
     */
    @Override
    public String toString() {
        return "Object{" +
                "intExample = " + intExample +
                ", longExample = " + longExample +
                ", shortExample = " + shortExample +
                ", stringExample = '" + stringExample + '\'' +
                '}';
    }
}

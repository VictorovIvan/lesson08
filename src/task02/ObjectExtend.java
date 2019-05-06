package task02;

import java.util.Arrays;

/**
 * Class ObjectExtend
 */
public class ObjectExtend implements java.io.Serializable {
    public int intExample;
    public Integer wrapIntExample;
    public String wrapStringExample;
    public int[] someArray;

    public enum SomeEnum {One, Two, Three}

    ;
    SomeEnum someEnum;
    ExampleClass exampleWithClass;

    /**
     * Constructor
     *
     * @param intExample        Some integer number
     * @param wrapIntExample    Some Integer value
     * @param wrapStringExample Some String value
     * @param someArray         Some array
     * @param someEnum          Some enum
     * @param exampleWithClass  Class for example
     */
    public ObjectExtend(int intExample, Integer wrapIntExample, String wrapStringExample,
                        int[] someArray, SomeEnum someEnum, ExampleClass exampleWithClass) {
        this.intExample = intExample;
        this.wrapIntExample = wrapIntExample;
        this.wrapStringExample = wrapStringExample;
        this.someArray = someArray;
        this.someEnum = someEnum;
        this.exampleWithClass = exampleWithClass;
    }

    /**
     * Returns a object representing this value.
     *
     * @return A string representation of the value of this object in base
     */
    @Override
    public String toString() {
        return "ObjectExtend{" +
                "intExample=" + intExample +
                ", wrapIntExample=" + wrapIntExample +
                ", wrapStringExample='" + wrapStringExample + '\'' +
                ", someArray=" + Arrays.toString(someArray) +
                ", someEnum=" + someEnum +
                ", exampleWithClass=" + exampleWithClass +
                '}';
    }
}

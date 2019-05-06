import task01.Object;
import task01.SerialDeserializeOfObj;
import task02.ExampleClass;
import task02.ObjectExtend;
import task02.SerialDeserialOfObjExtend;


public class Test {
    public static void main(String[] args) {
        /**
         * Task 01
         */
        Object someObjectTask01 = new Object(1, (long) 21, (short) 3, "Some string");
        Object readObjectTask01;
        String pathTextFileTask01 = ".\\someFileObjectTask01.txt";
        SerialDeserializeOfObj serialDeserializOfObj = new SerialDeserializeOfObj();
        System.out.println("Задание №1:");
        serialDeserializOfObj.serialize(someObjectTask01, pathTextFileTask01);
        readObjectTask01 = serialDeserializOfObj.deSerialize(pathTextFileTask01);
        System.out.println("Значения объекта первого задания: " + readObjectTask01.toString());
        /**
         * Task 02
         */
        Integer someInteger = 2;
        String someString = "Some string";
        int[] someArray = {10, 10, 5, 1, 2, 3};
        ExampleClass someClass = new ExampleClass(1, 2);
        ObjectExtend someObjectTask02 = new ObjectExtend(1, someInteger, someString,
                someArray, ObjectExtend.SomeEnum.One, someClass);
        ObjectExtend readObjectTask02;
        String pathTextFileTask02 = ".\\someFileObjectTask02.txt";
        SerialDeserialOfObjExtend serialDeserialOfObjExtend = new SerialDeserialOfObjExtend();
        System.out.println("\nЗадание №2:");
        serialDeserialOfObjExtend.serialize(someObjectTask02, pathTextFileTask02);
        readObjectTask02 = serialDeserialOfObjExtend.deSerialize(pathTextFileTask02);
        System.out.println("Значения объекта второго задания: " + readObjectTask02.toString());
    }
}

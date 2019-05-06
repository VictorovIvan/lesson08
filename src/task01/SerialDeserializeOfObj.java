package task01;

import java.io.*;

/**
 * Задание 1. Необходимо разработать класс, реализующий следующие методы:
 * void serialize (Object object, String file);
 * Object deSerialize(String file);
 * Методы выполняют сериализацию объекта Object в файл file и десериализацию объекта из этого файла.
 * Обязательна сериализация и десериализация "плоских" объектов (все поля объекта - примитивы, или String).
 */

/**
 * Class SerialDeserializeOfObj
 */
public class SerialDeserializeOfObj {
    /**
     * Method is serializing the input object
     *
     * @param object Some input object
     * @param file   Some file to serialize and save object
     */
    public void serialize(Object object, String file) {
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
            System.out.println("Объект сериализован");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    /**
     * Method is deserialize from the input file
     *
     * @param file Input file for serializing
     * @return ObjectExtend Some deserialize Object
     */
    public Object deSerialize(String file) {
        Object someObject = null;
        try {
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInput);
            someObject = (Object) in.readObject();
            in.close();
            fileInput.close();
            System.out.println("Объект десериализован");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        return someObject;
    }
}

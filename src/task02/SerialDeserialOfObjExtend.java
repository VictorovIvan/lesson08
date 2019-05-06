package task02;

import java.io.*;

/**
 * Задание 2. Предусмотреть работу c любыми типами полей (полями могут быть ссылочные типы).
 */

/**
 * Class SerialDeserialOfObjExtend
 */
public class SerialDeserialOfObjExtend {
    /**
     * Method is serializing the input object
     *
     * @param object Some input object
     * @param file   Some file to serialize and save object
     */
    public void serialize(ObjectExtend object, String file) {
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
     * @return ObjectExtend Seme deserialize Object
     */
    public ObjectExtend deSerialize(String file) {
        ObjectExtend someObject = (null);
        try {
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInput);
            someObject = (ObjectExtend) in.readObject();
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

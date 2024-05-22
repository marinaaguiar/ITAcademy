package io.alecrim.itacademy.sprint1.task5.n1exercise5;
import java.io.*;

public class SerializableObject implements Serializable {
    private String data;

    public SerializableObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static void serializeObject(SerializableObject object, String filePath) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred during serialization: " + e.getMessage());
        }
    }

    public static SerializableObject deserializeObject(String filePath) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            SerializableObject object = (SerializableObject) objectInputStream.readObject();
            System.out.println("Object deserialized successfully.");
            return object;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred during deserialization: " + e.getMessage());
        }
        return null;
    }
}
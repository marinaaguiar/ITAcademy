package io.alecrim.itacademy.sprint1.task5.n1exercise5;

public class Main {
    public static void main(String[] args) {
        String data = "Serialized object";
        SerializableObject objectToSerialize = new SerializableObject(data);

        String filePath = "serialized_object.ser";
        SerializableObject.serializeObject(objectToSerialize, filePath);

        SerializableObject deserializedObject = SerializableObject.deserializeObject(filePath);
        if (deserializedObject != null) {
            System.out.println("Deserialized object data: " + deserializedObject.getData());
        }
    }
}

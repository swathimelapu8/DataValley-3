import java.io.*;

class Customers implements Serializable {
    private int id;
    private String name;
    private String contact_no;
    private String address;

    public Customers(int id, String name, String contact_no, String address) {
        this.id = id;
        this.name = name;
        this.contact_no = contact_no;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public String getAddress() {
        return address;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Customers customers = new Customers(1, "John Doe", "1234567890", "123 Main St");

        try (FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(customers);
            System.out.println("Customers object serialized and saved to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

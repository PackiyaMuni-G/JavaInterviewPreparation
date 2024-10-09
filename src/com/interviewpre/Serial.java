package com.interviewpre;

import java.io.*;

class User implements Serializable {
    String username;
    transient String password;  // Marked as transient, won't be serialized

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class Serial {
    public static void main(String[] args) {
        User user = new User("john_doe", "secret123");

        // Serialize the user object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the user object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Username: " + deserializedUser.username);  // Prints john_doe
            System.out.println("Password: " + deserializedUser.password);  // Prints null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


package com.singhdevhub.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableIterable {
    
    /*
     * @Assignment:- 7
     * @Description:- Working with Serializable marker interface and Iterable interface
     */
    
    // -------// -------- // -------- // -------- 

    /* 
     * @Description:- Person class implementing Serializable so that it can be passed around
     */

     public class Person implements Serializable{
        private int age;
        private String name;

        public int getAge(){
            return this.age;
        }

        public void setAge(int age){
            this.age = age;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

    }

    /* 
     * @Description:- Method to write into output.txt
     * Input:- None
     * Output:- None
     */

    public void serializeAndWriteIntoFile () throws IOException {
        // Write "Ram Kumar" in output.txt. flush() and close() the ObjectOutputStream too
        Person person = new Person();
        person.setAge(20);
        person.setName("Ram Kumar");

        FileOutputStream fos = new FileOutputStream("output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }

    /*
     * @Description:- Method to read content from output.txt and print name & age both in new lines
     */
    public void deserializeAndReadFromFile() throws ClassNotFoundException, IOException {
        // Read "Ram Kumar" from output.txt and print the content
        FileInputStream fis = new FileInputStream("output.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

    /*
     * @Description:- Implement custom serialization/deserialization
     * Example:- do not implement, it is an example of defining custom serializer. no UnitTest case is present for this class
     */

     public class Employee implements Serializable {
        private static final long serialVersionUID = 1L;
        private transient int passcode = 0; // field default value will be serialized if provieded instead of the original value (transient keyword)
        private Person person;

        private void writeObject(ObjectOutputStream oos) throws IOException{
            oos.defaultWriteObject();
            oos.writeObject(oos);
        }

        private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
            ois.defaultReadObject();
            Integer age = (Integer) ois.readObject();
            Person person = new Person();
            person.setAge(age);
        }
     }


     /*
      * @Description:- 
      * Input:- 
      * Output:- 
      */

    

}

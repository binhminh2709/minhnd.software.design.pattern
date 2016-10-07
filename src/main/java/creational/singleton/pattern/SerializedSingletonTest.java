package creational.singleton.pattern;

import java.io.*;

/**
 * Created by nguyen on 10/7/2016.
 */
public class SerializedSingletonTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        SerializedSingleton readResolve = (SerializedSingleton) instanceTwo.readResolve();
//        SerializedSingleton instanceTwo = (SerializedSingleton) in.readResolve();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        //System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
        System.out.println("instanceTwo hashCode=" + readResolve.hashCode());

    }
}
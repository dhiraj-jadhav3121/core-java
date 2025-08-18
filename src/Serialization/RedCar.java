package Serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class RedCar {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:\\Users\\jadha\\Downloads\\car.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Car c = (Car) ois.readObject();

        System.out.println(c.name);
        System.out.println(c.color);

    }
}

